import java.util.ArrayList;

public abstract class AbstractVault {
    String name;
    String description;
    ArrayList<?> data;

    AbstractVault(String name, String description, ArrayList<?> data){
        this.name = name;
        this.description = description;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<?> getData() {
        return data;
    }

    public void setData(ArrayList<?> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n"+this.getClass().getName()+"'s \"" + name+"\" info:"
                +"\nName: "+name
                +"\nDescription: "+description;
    }
}
