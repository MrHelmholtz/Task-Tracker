import java.time.LocalDateTime;

public class Task extends AbstractAim{
    Task(String name, LocalDateTime creationDate, String description){
        super(name,creationDate, description);
    }

    public String toString(){
        return super.toString();
    }
}
