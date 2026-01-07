import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AppBuilder builder = new AppBuilder();
//        Helper.scan = new Scanner(System.in);

        System.out.println(builder.buildLibrary());
        System.out.println(builder.buildSection());
//        System.console().reader();



    }

    public static void buildLibraryTest(){
        Helper.scan = new Scanner(System.in);
    }
}