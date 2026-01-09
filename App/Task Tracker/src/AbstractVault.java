import java.util.HashMap;

public abstract class AbstractVault extends AbstractData{
    HashMap<?, ?> data;

    AbstractVault(String name, String description, HashMap<?, ?> data){
        super(name, description);
        this.data = data;
    }

    public HashMap<?, ?> getData() {
        return data;
    }

    public void setData(HashMap<?, ?> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nContains: "+data.size();
    }
}
