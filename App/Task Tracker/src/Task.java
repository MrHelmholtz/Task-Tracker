import java.time.LocalDate;

public class Task extends AbstractAim{
    Task(String name, LocalDate creationDate, String description){
        super(name,creationDate, description);
    }

    public String toString(){
        return super.toString();
    }
}
