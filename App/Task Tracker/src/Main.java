import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library lib = new Library("my lib", new ArrayList<>());
        System.out.println(lib.getName());
        lib.setName("new name");
        System.out.println(lib.getName());

    }
}