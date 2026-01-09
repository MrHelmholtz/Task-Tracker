import java.util.HashMap;

public class Library extends AbstractVault{
    Library(String name, String description, HashMap<String , Section> data){
        super(name,description, data);
    }

    @Override
    public String toString() {
        return super.toString()
                +" sections";
    }
}
