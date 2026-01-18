import java.util.ArrayList;


public abstract class AbstractVault extends AbstractData{
    ArrayList<?> data;

    AbstractVault(String name, String description, ArrayList<?> data){
        super(name, description);
        this.data = data;
    }

    public ArrayList<?> getData() {
        return data;
    }

    public void setData(ArrayList<?> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nContains: "+data.size();
    }
}
