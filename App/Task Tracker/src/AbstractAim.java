import java.time.LocalDateTime;

public abstract class AbstractAim {
    private String name;
    private LocalDateTime creationDate;
    private LocalDateTime finishingDate;
    private Boolean isCompleted;
    private String comment;

    AbstractAim(String name, LocalDateTime creationDate, String comment){
        this.name = name;
        this.creationDate = creationDate;
        this.isCompleted = false;
        this.comment = comment;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getFinishingDate() {
        return finishingDate;
    }

    public void setFinishingDate(LocalDateTime finishingDate) {
        this.finishingDate = finishingDate;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
