import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class AbstractAim {
    private String name;
    private LocalDate creationDate;
    private LocalDate finishingDate;
    private Boolean isCompleted;
    private String description;

    AbstractAim(String name, LocalDate creationDate, String description){
        this.name = name;
        this.description = description;
        this.isCompleted = false;
        this.creationDate = creationDate;
//        this.finishingDate = null;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getFinishingDate() {
        return finishingDate;
    }

    public void setFinishingDate(LocalDate finishingDate) {
        this.finishingDate = finishingDate;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "\n"+this.getClass().getName()+"'s \"" + name+"\" info:"
                +"\nName: "+name
                +"\nDescription: "+description
                +"\nCreation date: "+creationDate
                +"\nFinishing date: "+ (finishingDate == null ? "hasn't been finished" : finishingDate)
                +"\nIs completed: "+ isCompleted;

    }


}
