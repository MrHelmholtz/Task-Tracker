import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AppBuilder implements Builder{
//    private Scanner s = new Scanner(System.in);

    private String[] getNameAndDescription(String target){
        System.out.println("It's time to create a "+target+"...");
        System.out.print("Enter the "+target+"'s name: ");
        String name = Helper.scan.nextLine();
        String description;
        if(Helper.yesOrNoMenu("Does "+name+" need a description")){
            System.out.print("Enter "+target+"'s description: ");
            description = Helper.scan.nextLine();
        } else description = "No description";

        String[] arr = {name, description};
        return arr;
    }

    @Override
    public Library buildLibrary() {

        String[] nameAndDescription = getNameAndDescription("library");
        System.out.println("Congratulations! Your "+nameAndDescription[0]+" library has been successfully created.");
        ArrayList<Section> data = new ArrayList<Section>();
        return new Library(nameAndDescription[0], nameAndDescription[1], data);
    }

    @Override
    public Section buildSection() {
        String[] nameAndDescription = getNameAndDescription("section");
        System.out.println("Congratulations! Your "+nameAndDescription[0]+" section has been successfully created.");
        ArrayList<Goal> data = new ArrayList<Goal>();
        return new Section(nameAndDescription[0], nameAndDescription[1], data);
        }

    @Override
    public Goal buildGoal(){
        String[] nameAndDescription = getNameAndDescription("goal");
        LocalDateTime creationDate = LocalDateTime.now();
        ArrayList<Task> data = new ArrayList<Task>();
        int taskTotalCount = data.size();
        return new Goal(nameAndDescription[0], creationDate, nameAndDescription[1], taskTotalCount, data);
    }

    @Override
    public Task buildTask(){
        String[] nameAndDescription = getNameAndDescription("task");
        LocalDateTime creationDate = LocalDateTime.now();
        return new Task(nameAndDescription[0], creationDate, nameAndDescription[1]);
    }
}
