import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class AppManager extends Manager{
    private AppKeeper keeper;
    private AppBuilder builder;


    AppManager(){
        keeper = new AppKeeper();
        builder = new AppBuilder();
    }

    @Override
    public void addLibrary() {
        keeper.setLibrary(builder.buildLibrary());
    }

    @Override
    public void deleteLibrary() {
        if(Helper.yesOrNoMenu("\nAre you sure, you want to delete "+keeper.getLibrary().getName()+" library?"))
        {
            keeper.setLibrary(null);
            System.out.println("\nLibrary has been successfully deleted");
        }
    }

    @Override
    public void adjustLibrary() {
        if(Helper.yesOrNoMenu("\nAre you sure you want to delete "+keeper.getLibrary().getName()+" library?"))
        {
            keeper.setLibrary(null);
            System.out.println("\nLibrary has been successfully deleted");
        }
    }

    public <T extends AbstractVault> void adjust(T vault) {
        switch (Helper.makeMenu("\nWhat do you want to adjust in "
                + vault.getClass() + " " + vault.getName() + "?", "Name", "Description", "Data")) {
            case 1:
                adjustName(vault);
                break;
            case 2:
                adjustDescription(vault);
                break;

            case 3:
                System.out.println("\n"+vault.getClass() + " " + vault.getName() +" contains:");
                if(vault.getData().isEmpty()){
                    System.out.println(vault.getClass() + " " + vault.getName() +" doesn't contain anything.");
                    break;
                }
                int i = 1;
                HashMap<String , ?> data = (HashMap<String, ?>) vault.getData();
                HashMap<Integer, String> map = new HashMap<>();
                for (String key: (Set<String>) data.keySet()){
                    System.out.println(i+")"+data.get(key).getClass()+" "+key);
                    map.put(i, key);
                    i++;
                }
                System.out.print("Which element do you want to adjust?\nEnter number:");
                String elementToAdjustName = map.get(Helper.scan.nextInt());
                Helper.scan.nextLine();

                if(data.get(elementToAdjustName) instanceof Section){
                    adjust((Section) data.get(elementToAdjustName));
                } else{
                    if(data.get(elementToAdjustName) instanceof StrictGoal){
                        adjust((StrictGoal) data.get(elementToAdjustName));
                    } else {
                        adjust((Goal) data.get(elementToAdjustName));
                    }
                }
                break;

        }

    }

    public void adjust(Goal goal){
        switch (Helper.makeMenu("\nWhat do you want to adjust in "
                + goal.getClass() + " " + goal.getName() + "?", "Name", "Description", "Data")){
            case 1:
                adjustName(goal);
                break;
            case 2:
                adjustDescription(goal);
                break;

            case 3:
                adjustTasks(goal);
                break;
        }
    }

    public void adjust(StrictGoal goal){
        switch (Helper.makeMenu("\nWhat do you want to adjust in "
                + goal.getClass() + " " + goal.getName() + "?", "Name", "Description", "Data", "Deadline date")){
            case 1:
                adjustName(goal);
                break;
            case 2:
                adjustDescription(goal);
                break;

            case 3:
                adjustTasks(goal);
                break;
            case 4:

        }
    }



    private static void adjustName(AbstractData object){
        System.out.println("\nCurrent name: " + object.getName());
        System.out.print("Enter new name: ");
        object.setName(Helper.scan.nextLine());
        System.out.println("\nName has been successfully changed!");
        System.out.println("\nUpdated name:");
        System.out.println(object.getName());
    }

    private static void adjustDescription(AbstractData object){
        System.out.println("\nCurrent description: " + object.getDescription());

        if (Helper.makeMenu("\nDo you want to append new info to the description" +
                " or replace the description?", "Append", "Replace") == 1) {
            System.out.print("\nEnter description to append: ");
            object.setDescription(object.getDescription() + "\n\nAdded" + LocalDate.now() +
                    ":\n" + Helper.scan.nextLine());
            System.out.println("\nUpdated description:");
            System.out.println(object.getDescription());
        } else {
            System.out.print("Enter new description: ");
            object.setName(Helper.scan.nextLine());
        }
        System.out.println("\nDescription has been successfully modified!");
        System.out.println("\nUpdated description:");
        System.out.println(object.getDescription());
    }

    private static void adjustDeadline(AbstractData object){
        System.out.println("\nCurrent description: " + object.getDescription());

        if (Helper.makeMenu("\nDo you want to append new info to the description" +
                " or replace the description?", "Append", "Replace") == 1) {
            System.out.print("\nEnter description to append: ");
            object.setDescription(object.getDescription() + "\n\nAdded" + LocalDate.now() +
                    ":\n" + Helper.scan.nextLine());
            System.out.println("\nUpdated description:");
            System.out.println(object.getDescription());
        } else {
            System.out.print("Enter new description: ");
            object.setName(Helper.scan.nextLine());
        }
        System.out.println("\nDescription has been successfully modified!");
        System.out.println("\nUpdated description:");
        System.out.println(object.getDescription());
    }


    private static void adjustTasks(Goal goal){
        ArrayList<Task> tasks = goal.getTasks();
        System.out.println("\n"+goal.getClass() + " " + goal.getName() +" contains:");
        if(tasks.isEmpty()){
            System.out.println(goal.getClass() + " " + goal.getName() +" doesn't contain anything.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i+1+")"+tasks.get(i).getClass()+" "+tasks.get(i).getName());
        }
        System.out.print("Which element do you want to adjust?\nEnter number:");
        Task taskToAdjust = tasks.get(Helper.scan.nextInt()-1);
        Helper.scan.nextLine();
        if(taskToAdjust instanceof StrictTask) {
//            adjust((StrictTask) taskToAdjust);
        } else{
//            adjust(taskToAdjust);
        }
    }



}
