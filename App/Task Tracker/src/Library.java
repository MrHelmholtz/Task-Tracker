import java.util.ArrayList;


public class Library extends AbstractVault{
    Library(String name, String description, ArrayList<Section> data){
        super(name,description, data);
    }

    @Override
    public String toString() {
        return super.toString()
                +" sections";
    }
}
