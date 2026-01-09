import java.util.HashMap;

public class Section extends AbstractVault{
    Section(String name, String description, HashMap<String, Goal> data){
        super(name,description, data);
    }

    @Override
    public String toString() {
        return super.toString()
                +" goals";
    }
}
