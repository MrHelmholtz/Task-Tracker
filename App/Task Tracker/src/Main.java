import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public AppBuilder builder = new AppBuilder();
    static public AppManager manager = new AppManager();

    public static void main(String[] args) throws IOException {

        printAllTestObjects();

//        adjustLibraryTest();
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
        manager.adjust(lib);
        System.out.println(lib);
//        manager.adjust(lib);
//        System.out.println(lib);
//        manager.adjust(lib);
//        System.out.println(lib);
    }


    public static void changeScannerPath(String pathEnd){
        try{
            Helper.scan = new Scanner(Path.of("C:\\Users\\Lenovo\\My projects\\Task_and_Goals_tracker\\App" +
                    "\\Task Tracker\\Tests"+pathEnd));

        } catch (IOException e) {
            System.out.println("IOException: "+e);
        }
    }
    public static void resetScannerPath(){
        Helper.scan = new Scanner(System.in);
    }


    public static Library buildTestLibrary() {
        changeScannerPath("\\buildTests\\libraryWithDesc.txt");
        Library library = builder.buildLibrary();
        resetScannerPath();
        return library;
    }
    public static Section buildTestSection(){
        changeScannerPath("\\buildTests\\sectionWithDesc.txt");
        Section section = builder.buildSection();
        resetScannerPath();
        return section;
    }
    public static Goal buildTestGoal() {
        changeScannerPath("\\buildTests\\goalWithDesc.txt");
        Goal goal = builder.buildGoal();
        resetScannerPath();
        return goal;
    }
    public static StrictGoal buildTestStrictGoal() {
        changeScannerPath("\\buildTests\\strictGoalWithDesc.txt");
        StrictGoal strictGoal = builder.buildStrictGoal();
        resetScannerPath();
        return strictGoal;
    }
    public static Task buildTestTask() {
        changeScannerPath("\\buildTests\\taskWithDesc.txt");
        Task task = builder.buildTask();
        resetScannerPath();
        return task;
    }
    public static StrictTask buildTestStrictTask(){
        changeScannerPath("\\buildTests\\strictTaskWithDesc.txt");
        StrictTask strictTask = builder.buildStrictTask();
        resetScannerPath();
        return strictTask;
    }





}