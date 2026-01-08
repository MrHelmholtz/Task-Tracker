import java.time.LocalDate;

public abstract class AbstractAim extends AbstractData{
    private LocalDate creationDate;
    private LocalDate finishingDate;
    private Boolean isCompleted;

    AbstractAim(String name, LocalDate creationDate, String description){
        super(name, description);
        this.isCompleted = false;
        this.creationDate = creationDate;
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



    @Override
    public String toString(){
        return super.toString()
                +"\nCreation date: "+creationDate
                +"\nFinishing date: "+ (finishingDate == null ? "hasn't been finished" : finishingDate)
                +"\nIs completed: "+ isCompleted;

    }


}
