import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class StrictGoal extends Goal{
    private LocalDate deadlineDate;

    StrictGoal(String name, LocalDate creationDate, String description,
               int tasksTotalCount, ArrayList<Task> tasks, LocalDate deadlineDate){
        super(name, creationDate, description, tasksTotalCount, tasks);
        this.deadlineDate = deadlineDate;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    @Override
    public String toString(){
        return super.toString()
               +"\nDeadline date: "+deadlineDate
               +"\nRemaining time: "+ Period.between(LocalDate.now(), deadlineDate);
    }
}
