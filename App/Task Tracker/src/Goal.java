import java.time.LocalDate;
import java.util.ArrayList;

public class Goal extends AbstractAim{
    private int tasksTotalCount;
    private int completedTasksCount;
    private int incompletedTasksCount;
    private ArrayList<Task> tasks;

    Goal(String name, LocalDate creationDate, String description, int tasksTotalCount, ArrayList<Task> tasks){
        super(name, creationDate, description);
        this.tasksTotalCount = tasksTotalCount;
        this.completedTasksCount = 0;
        this.incompletedTasksCount = this.tasksTotalCount;
        this.tasks = tasks;
    }

    public int getTasksTotalCount() {
        return tasksTotalCount;
    }

    public void setTasksTotalCount(int tasksTotalCount) {
        this.tasksTotalCount = tasksTotalCount;
    }

    public int getCompletedTasksCount() {
        return completedTasksCount;
    }

    public void setCompletedTasksCount(int completedTasksCount) {
        this.completedTasksCount = completedTasksCount;
    }

    public int getIncompletedTasksCount() {
        return incompletedTasksCount;
    }

    public void setIncompletedTasksCount(int incompletedTasksCount) {
        this.incompletedTasksCount = incompletedTasksCount;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }


    @Override
    public String toString(){
        return super.toString()
                +"\nTotal tasks count: "+tasksTotalCount
                +"\nCompleted tasks count: "+completedTasksCount
                +"\nIncompleted tasks count: "+incompletedTasksCount;
    }
}
