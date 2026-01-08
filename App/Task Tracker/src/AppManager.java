import java.time.LocalDate;

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
        switch (Helper.adjustMenu("\nWhat do you want to adjust in "
                + vault.getClass() + " " + vault.getName() + "?")) {
            case 1:
                System.out.println("\nCurrent name: " + vault.getName());
                System.out.print("Enter new name: ");
                vault.setName(Helper.scan.nextLine());
                System.out.println("\nName has been successfully changed!");
                System.out.println("\nUpdated name:");
                System.out.println(vault.getName());
                break;
            case 2:
                System.out.println("\nCurrent description: " + vault.getDescription());

                if (Helper.makeMenu("\nDo you want to append new info to the description" +
                        " or replace the description?", "Append", "Replace") == 1) {
                    System.out.print("\nEnter description to append: ");
                    vault.setDescription(vault.getDescription() + "\n\nAdded" + LocalDate.now() +
                            ":\n" + Helper.scan.nextLine());
                    System.out.println("\nUpdated description:");
                    System.out.println(vault.getDescription());
                } else {
                    System.out.print("Enter new description: ");
                    vault.setName(Helper.scan.nextLine());
                }
                System.out.println("\nDescription has been successfully modified!");
                System.out.println("\nUpdated description:");
                System.out.println(vault.getDescription());
                break;

            case 3:
                break;

        }

    }



    public <T extends AbstractAim> void adjust(T aim){
        switch (Helper.adjustMenu("\nWhat do you want to adjust in "
                +vault.getClass()+" "+vault.getName()+"?")){
            case 1:
                System.out.println("\nCurrent name: "+vault.getName());
                System.out.print("Enter new name: ");
                vault.setName(Helper.scan.nextLine());
                System.out.println("\nName has been successfully changed!");
                System.out.println("\nUpdated name:");
                System.out.println(vault.getName());
                break;
            case 2:
                System.out.println("\nCurrent description: "+vault.getDescription());

                if(Helper.makeMenu("\nDo you want to append new info to the description" +
                        " or replace the description?", "Append", "Replace") == 1){
                    System.out.print("\nEnter description to append: ");
                    vault.setDescription(vault.getDescription() +"\n\nAdded"+ LocalDate.now()+
                            ":\n" + Helper.scan.nextLine());
                    System.out.println("\nUpdated description:");
                    System.out.println(vault.getDescription());
                }   else{
                    System.out.print("Enter new description: ");
                    vault.setName(Helper.scan.nextLine());
                }
                System.out.println("\nDescription has been successfully modified!");
                System.out.println("\nUpdated description:");
                System.out.println(vault.getDescription());
                break;

            case 3:
                break;
        }




    }


}
