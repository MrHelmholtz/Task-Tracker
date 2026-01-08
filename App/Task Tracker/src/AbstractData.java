
public abstract class AbstractData {
    private String name;
    private String description;

    AbstractData(String name, String description){
        this.name = name;
        this.description = description;
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


    @Override
    public String toString() {
        return "\n"+this.getClass().getName()+"'s \"" + name+"\" info:"
                +"\nName: "+name
                +"\nDescription: "+description;
    }
}
