import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public AppBuilder builder = new AppBuilder();

    public static void main(String[] args) throws IOException {

        printAllTestObjects();
    }

    public static void printAllTestObjects() throws IOException {
        System.out.println(buildTestLibrary());
        System.out.println(buildTestSection());
        System.out.println(buildTestGoal());
        System.out.println(buildTestTask());
        System.out.println(buildTestStrictGoal());
        System.out.println(buildTestStrictTask());
    }


    public static Library buildTestLibrary() throws IOException{
        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\libraryWithDesc.txt"));
        Library library = builder.buildLibrary();
        Helper.scan = new Scanner(System.in);
        return library;
    }


    public static Section buildTestSection() throws IOException{
        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\sectionWithDesc.txt"));
        Section section = builder.buildSection();
        Helper.scan = new Scanner(System.in);
        return section;
    }
    public static Goal buildTestGoal() throws IOException{
        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\goalWithDesc.txt"));
        Goal goal = builder.buildGoal();
        Helper.scan = new Scanner(System.in);
        return goal;
    }
    public static StrictGoal buildTestStrictGoal() throws IOException{
        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\strictGoalWithDesc.txt"));
        StrictGoal strictGoal = builder.buildStrictGoal();
        Helper.scan = new Scanner(System.in);
        return strictGoal;
    }
    public static Task buildTestTask() throws IOException{
        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\taskWithDesc.txt"));
        Task task = builder.buildTask();
        Helper.scan = new Scanner(System.in);
        return task;
    }

    public static StrictTask buildTestStrictTask() throws IOException{
        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\strictTaskWithDesc.txt"));
        StrictTask strictTask = builder.buildStrictTask();
        Helper.scan = new Scanner(System.in);
        return strictTask;
    }





}