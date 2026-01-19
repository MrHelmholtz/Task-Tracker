import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

public class AppManager implements Manager{
    private AppKeeper keeper;
    private AppBuilder builder;


    AppManager(AppKeeper keeper, AppBuilder builder){
        this.keeper = keeper;
        this.builder = builder;
    }

    @Override
    public void addLibrary() {
        keeper.setLibrary(builder.buildLibrary());
    }

    public void addSection() {
        Section newSection = builder.buildSection();
//        Section newSection = Main.buildTestSection(); // for test purposes
        ArrayList<Section> sections = (ArrayList<Section>) keeper.getLibrary().getData();
        sections.add(newSection);
    }

    public void addGoal(){
        ArrayList<Section> sections = (ArrayList<Section>) keeper.getLibrary().getData();
        ListIterator<Section> sectionsIterator = sections.listIterator();


        String[] sectionNames = new String[sections.size()];

        for (int i = 0; i < sections.size(); i++) {
            Section section = sections.get(i);
            sectionNames[i] = section.getClass().getName() +" "+section.getName();
        }

//        while(sectionsIterator.hasNext()){
//            Section section = sectionsIterator.next();
//            sectionNames.
//        }
//        String[] sectionNames = (String[]) sections.stream().map((section) -> {
//                                return section.getClass().getName() +" "+section.getName();
//                                                                                      }).toArray();

//        String[] sectionNames = new String[sections.size()+5];
//        sections.toArray(sectionNames);


        int selectedSectionNumber = Helper.selectOption("To which section do you want to add a goal?",
                                                       sectionNames);

        if( selectedSectionNumber > sections.size()) return;
        Section selectedSection = sections.get(selectedSectionNumber);
        ArrayList<Goal> data = (ArrayList<Goal>) selectedSection.getData();
        int decision = Helper.selectOption("Do you want to create a regular goal or a strict goal?",
                "Goal", "Strict goal");
        if(decision == 0){
            Goal newGoal = builder.buildGoal();
//            Goal newGoal = Main.buildTestGoal(); // for test purposes
            data.add(newGoal);
        }else{
            StrictGoal newGoal = builder.buildStrictGoal();
//            StrictGoal newGoal = Main.buildTestStrictGoal(); // for test purposes
            data.add(newGoal);
        }
    }

    @Override
    public void delete() {
        if(Helper.yesOrNoMenu("\nAre you sure, you want to delete "+keeper.getLibrary().getName()+" library?"))
        {
            keeper.setLibrary(null);
            System.out.println("\nLibrary has been successfully deleted");
        }
    }




//    public String showAndSelectOptionForHashmap(AbstractVault vault,String purpose){
//        System.out.println("\n"+vault.getClass().getName() + " " + vault.getName() +" contains:");
//        if(vault.getData().isEmpty()){
//            System.out.println(vault.getClass().getName() + " " + vault.getName() +" doesn't contain anything.");
//            return null;
//        }
//        int i = 1;
//        HashMap<String , ?> data = (HashMap<String, ?>) vault.getData();
//        HashMap<Integer, String> map = new HashMap<>();
//        for (String key: (Set<String>) data.keySet()){
//            System.out.println(i+")"+data.get(key).getClass().getName()+" "+key);
//            map.put(i, key);
//            i++;
//        }
//        System.out.print(purpose + "\nEnter number:");
//        String selectedOption = map.get(Helper.scan.nextInt());
//        Helper.scan.nextLine();
//
//        return selectedOption;
//    }

//    public String selectOption(HashMap<Integer, String > optionsMap){
//        System.out.println("\n"+vault.getClass().getName() + " " + vault.getName() +" contains:");
//        if(vault.getData().isEmpty()){
//            System.out.println(vault.getClass().getName() + " " + vault.getName() +" doesn't contain anything.");
//            return null;
//        }
//        int i = 1;
//        HashMap<String , ?> data = (HashMap<String, ?>) vault.getData();
//        HashMap<Integer, String> map = new HashMap<>();
//        for (String key: (Set<String>) data.keySet()){
//            System.out.println(i+")"+data.get(key).getClass().getName()+" "+key);
//            map.put(i, key);
//            i++;
//        }
//        System.out.print(purpose + "\nEnter number:");
//        String selectedOption = map.get(Helper.scan.nextInt());
//        Helper.scan.nextLine();
//
//        return selectedOption;
//    }


//    public String showAndSelectOptionForArrayList(Goal goal, String purpose){
//        ArrayList<Task> tasks = goal.getTasks();
//        System.out.println("\n"+goal.getClass().getName() + " " + goal.getName() +" contains:");
//        if(tasks.isEmpty()){
//            System.out.println(goal.getClass().getName() + " " + goal.getName() +" doesn't contain anything.");
//            return null;
//        }
//        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println(i+1+")"+tasks.get(i).getClass()+" "+tasks.get(i).getName());
//        }
//        System.out.print(purpose+"\nEnter number:");
//        Task taskToAdjust = tasks.get(Helper.scan.nextInt()-1);
//        Helper.scan.nextLine();
//        if(taskToAdjust instanceof StrictTask) {
//            adjust((StrictTask) taskToAdjust);
//        } else{
//            adjust(taskToAdjust);
//        }
//        System.out.print(purpose + "\nEnter number:");
//        String selectedOption = map.get(Helper.scan.nextInt());
//        Helper.scan.nextLine();
//
//        return selectedOption;
//    }

//    @Override
//    public void adjust(AbstractVault vault) {
//        switch (Helper.selectOption("\nWhat do you want to adjust in "
//                + vault.getClass().getName() + " '" + vault.getName() + "'?", "Name", "Description", "Data")) {
//            case 1:
//                adjustName(vault);
//                break;
//            case 2:
//                adjustDescription(vault);
//                break;
//
//            case 3:
//                HashMap<String , ?> data = (HashMap<String, ?>) vault.getData();
//                String elementToAdjustName = showAndSelectOptionForHashmap(vault,
//                        "Which element do you want to adjust?");
//
//                if(data.get(elementToAdjustName) instanceof Section){
//                    adjust((Section) data.get(elementToAdjustName));
//                } else{
//                    if(data.get(elementToAdjustName) instanceof StrictGoal){
//                        adjust((StrictGoal) data.get(elementToAdjustName));
//                    } else {
//                        adjust((Goal) data.get(elementToAdjustName));
//                    }
//                }
//                break;
//
//        }
//
//    }

    public void adjust(Goal goal){
        switch (Helper.selectOption("\nWhat do you want to adjust in "
                + goal.getClass().getName() + " " + goal.getName() + "?", "Name", "Description", "Data")){
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

    public void adjust(StrictGoal strictGoal){
        switch (Helper.selectOption("\nWhat do you want to adjust in "
                + strictGoal.getClass().getName() + " " + strictGoal.getName()
                + "?", "Name", "Description", "Data", "Deadline date")){
            case 1:
                adjustName(strictGoal);
                break;
            case 2:
                adjustDescription(strictGoal);
                break;

            case 3:
                adjustTasks(strictGoal);
                break;
            case 4:
                adjustDeadlineDate(strictGoal);
                break;

        }
    }

    public void adjust(Task task){
        switch (Helper.selectOption("\nWhat do you want to adjust in "
                + task.getClass().getName() + " " + task.getName() + "?", "Name", "Description")){
            case 1:
                adjustName(task);
                break;
            case 2:
                adjustDescription(task);
                break;
        }
    }

    public void adjust(StrictTask strictTask){
        switch (Helper.selectOption("\nWhat do you want to adjust in "
                + strictTask.getClass().getName() + " " + strictTask.getName() + "?", "Name", "Description", "Deadline date")){
            case 1:
                adjustName(strictTask);
                break;
            case 2:
                adjustDescription(strictTask);
                break;

            case 3:
                adjustDeadlineDate(strictTask);
                break;

        }
    }

    private void adjustName(AbstractData object){
        System.out.println("\nCurrent name: " + object.getName());
        System.out.print("Enter new name: ");
        object.setName(Helper.scan.nextLine());
        System.out.println("\nName has been successfully changed!");
        System.out.println("\nUpdated name:");
        System.out.println(object.getName());
    }

    private void adjustDescription(AbstractData object){
        System.out.println("\nCurrent description: " + object.getDescription());

        if (Helper.selectOption("\nDo you want to append new info to the description" +
                " or replace the description?", "Append", "Replace") == 1) {
            System.out.print("\nEnter description to append: ");
            object.setDescription(object.getDescription() + "\nAdded " + LocalDate.now() +
                    ":\n" + Helper.scan.nextLine());
//            System.out.println("\nUpdated description:");
//            System.out.println(object.getDescription());
        } else {
            System.out.print("Enter new description: ");
            object.setDescription(Helper.scan.nextLine());
        }
        System.out.println("\nDescription has been successfully modified!");
        System.out.println("\nUpdated description:");
        System.out.println(object.getDescription());
    }

    private void adjustDeadlineDate(StrictAim strictAim){
        System.out.println("\nCurrent deadline date: " + strictAim.getDeadlineDate());

        System.out.print("Enter new deadline date(in format 'day.month.year'): ");
        strictAim.setDeadlineDate(LocalDate.parse(Helper.scan.nextLine(),
                DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println("\nDeadline date has been successfully changed!");
        System.out.println("\nUpdated deadline date:");
        System.out.println(strictAim.getDeadlineDate());
    }

    private void adjustTasks(Goal goal){
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
            adjust((StrictTask) taskToAdjust);
        } else{
            adjust(taskToAdjust);
        }
    }



}
