public class AppPrinter implements Printer{
    @Override
    public void printMenu(){
        int choice;
        System.out.println("Welcome to Task Tracker 1.0");
        System.out.println();
        do{
            choice = Helper.selectOption("What do you want to do?", "Explore library", "Show sections",
                                        "Show goals", "Show tasks", "Adjust library", "Exit");

        }while(choice != 6);

    }
}
