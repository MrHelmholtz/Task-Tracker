import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public AppBuilder builder = new AppBuilder();
    static public AppKeeper keeper = new AppKeeper();
    static public AppManager manager = new AppManager(keeper, builder);

    public static void main(String[] args) throws IOException {

//        printAllTestObjects();
//        adjustLibraryTest();

        addLibraryTest();
        addSectionTest();
        addSectionTest();
        addSectionTest();

    }

    public static void printAllTestObjects() throws IOException {
        System.out.println(buildTestLibrary());
        System.out.println(buildTestSection());
        System.out.println(buildTestGoal());
        System.out.println(buildTestTask());
        System.out.println(buildTestStrictGoal());
        System.out.println(buildTestStrictTask());
    }


    public static void addLibraryTest(){
        changeScannerPath("\\buildTests\\libraryWithDesc.txt");
        manager.addLibrary();
        System.out.println(keeper.getLibrary());
        resetScannerPath();
    }

    public static void addSectionTest(){
        if(keeper.getLibrary() == null){
            System.out.println("Library is not initialized");
            return;
        }
        changeScannerPath("\\buildTests\\sectionWithDesc.txt");
        manager.addSection();
        System.out.println(keeper.getLibrary());
        System.out.println(keeper.getLibrary().getData());
        resetScannerPath();
    }

    public static void adjustLibraryTest() {
        Library lib = buildTestLibrary();

        changeScannerPath("\\AdjustTests\\adjustLibrary.txt");
        manager.adjust(lib); //check changing name
        manager.adjust(lib); // check replacing description
        manager.adjust(lib); // check appending description
        System.out.println(lib);
        resetScannerPath();
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
        section.setName(section.getName() + Math.random()*100); // make unique names for adding to library
        resetScannerPath();
        return section;
    }
    public static Goal buildTestGoal() {
        changeScannerPath("\\buildTests\\goalWithDesc.txt");
        Goal goal = builder.buildGoal();
        goal.setName(goal.getName() + Math.random()*100);
        resetScannerPath();
        return goal;
    }
    public static StrictGoal buildTestStrictGoal() {
        changeScannerPath("\\buildTests\\strictGoalWithDesc.txt");
        StrictGoal strictGoal = builder.buildStrictGoal();
        strictGoal.setName(strictGoal.getName() + Math.random()*100);
        resetScannerPath();
        return strictGoal;
    }
    public static Task buildTestTask() {
        changeScannerPath("\\buildTests\\taskWithDesc.txt");
        Task task = builder.buildTask();
        task.setName(task.getName() + Math.random()*100);

        resetScannerPath();
        return task;
    }
    public static StrictTask buildTestStrictTask(){
        changeScannerPath("\\buildTests\\strictTaskWithDesc.txt");
        StrictTask strictTask = builder.buildStrictTask();
        strictTask.setName(strictTask.getName() + Math.random()*100);
        resetScannerPath();
        return strictTask;
    }





}