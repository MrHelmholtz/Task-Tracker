//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AppBuilder builder = new AppBuilder();

        System.out.println(builder.buildLibrary().getName());
        System.out.println(builder.buildSection().getDescription());
        System.out.println(builder.buildGoal().getDescription());
        System.out.println(builder.buildTask().getCreationDate());


    }
}