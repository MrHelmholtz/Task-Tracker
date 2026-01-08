import java.time.LocalDate;
import java.time.Period;

public class StrictTask extends Task implements StrictAim{

    private LocalDate deadlineDate;

    StrictTask(String name, LocalDate creationDate, String description, LocalDate deadlineDate){
        super(name,creationDate, description);
        this.deadlineDate = deadlineDate;
    }

    @Override
    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    @Override
    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String toString(){
        return super.toString()
                +"\nDeadline date: "+deadlineDate
                +"\nRemaining time: "+ Period.between(LocalDate.now(), deadlineDate);
    }
}
