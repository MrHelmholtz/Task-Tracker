import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppBuilder implements Builder{
//    private Scanner s = new Scanner(System.in);

    private String[] getNameAndDescription(String target){
        System.out.println("\nIt's time to create a "+target+"...");
        System.out.print("Enter the "+target+"'s name: ");
        String name = Helper.scan.nextLine();
        String description;
        if(Helper.yesOrNoMenu("\nDoes "+name+" need a description")){
            System.out.print("Enter "+target+"'s description: ");
            description = Helper.scan.nextLine();
        } else description = "No description";

        String[] arr = {name, description};
        return arr;
    }

    @Override
    public Library buildLibrary() {

        String[] nameAndDescription = getNameAndDescription("library");
        System.out.println("\nCongratulations! Your "+nameAndDescription[0]+" library has been successfully created.");
        ArrayList<Section> data = new ArrayList<Section>();
        return new Library(nameAndDescription[0], nameAndDescription[1], data);
    }

    @Override
    public Section buildSection() {
        String[] nameAndDescription = getNameAndDescription("section");
        System.out.println("\nCongratulations! Your "+nameAndDescription[0]+" section has been successfully created.");
        ArrayList<Goal> data = new ArrayList<Goal>();
        return new Section(nameAndDescription[0], nameAndDescription[1], data);
        }

    @Override
    public Goal buildGoal(){
        String[] nameAndDescription = getNameAndDescription("goal");
        LocalDate creationDate = LocalDate.now();
        ArrayList<Task> data = new ArrayList<Task>();
        int taskTotalCount = data.size();
        return new Goal(nameAndDescription[0], creationDate, nameAndDescription[1], taskTotalCount, data);
    }

    public StrictGoal buildStrictGoal(){
        String[] nameAndDescription = getNameAndDescription("strict goal");
        LocalDate creationDate = LocalDate.now();
        ArrayList<Task> data = new ArrayList<Task>();
        int taskTotalCount = data.size();
        System.out.print("\nEnter the goal's deadline:");
        LocalDate deadlineDate = LocalDate.parse(Helper.scan.nextLine(),
                                                         DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return new StrictGoal(nameAndDescription[0], creationDate, nameAndDescription[1], taskTotalCount, data,
                              deadlineDate);
    }

    @Override
    public Task buildTask(){
        String[] nameAndDescription = getNameAndDescription("task");
        LocalDate creationDate = LocalDate.now();
        return new Task(nameAndDescription[0], creationDate, nameAndDescription[1]);
    }

    public StrictTask buildStrictTask(){
        String[] nameAndDescription = getNameAndDescription("strict task");
        LocalDate creationDate = LocalDate.now();
        System.out.print("\nEnter the task's deadline:");
        LocalDate deadlineDate = LocalDate.parse(Helper.scan.nextLine(),
                DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return new StrictTask(nameAndDescription[0], creationDate, nameAndDescription[1], deadlineDate);
    }

}
