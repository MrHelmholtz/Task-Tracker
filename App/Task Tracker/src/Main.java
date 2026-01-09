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



    public static void adjustLibraryTest() {
        Library lib = buildTestLibrary();
    }

    public static Library buildTestLibrary() {
        try{
            Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                    "\\Task Tracker\\Tests\\buildTests\\libraryWithDesc.txt"));

        } catch (IOException e) {
            System.out.println("IOException: "+e);
        }
        Library library = builder.buildLibrary();
        Helper.scan = new Scanner(System.in);
        return library;
    }


    public static Section buildTestSection(){
        try{
        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\sectionWithDesc.txt"));
        } catch (IOException e) {
            System.out.println("IOException: "+e);
        }
        Section section = builder.buildSection();
        Helper.scan = new Scanner(System.in);
        return section;
    }
    public static Goal buildTestGoal() {
        try{

        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\goalWithDesc.txt"));
    } catch (IOException e) {
        System.out.println("IOException: "+e);
    }
        Goal goal = builder.buildGoal();
        Helper.scan = new Scanner(System.in);
        return goal;
    }
    public static StrictGoal buildTestStrictGoal() {
        try{

        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\strictGoalWithDesc.txt"));
    } catch (IOException e) {
        System.out.println("IOException: "+e);
        }
        StrictGoal strictGoal = builder.buildStrictGoal();
        Helper.scan = new Scanner(System.in);
        return strictGoal;
    }
    public static Task buildTestTask() {
        try{

        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\taskWithDesc.txt"));
    } catch (IOException e) {
        System.out.println("IOException: "+e);
        }
        Task task = builder.buildTask();
        Helper.scan = new Scanner(System.in);
        return task;
    }

    public static StrictTask buildTestStrictTask(){
        try{

        Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                "\\Task Tracker\\Tests\\buildTests\\strictTaskWithDesc.txt"));
    } catch (IOException e) {
        System.out.println("IOException: "+e);
        }
        StrictTask strictTask = builder.buildStrictTask();
        Helper.scan = new Scanner(System.in);
        return strictTask;
    }





}