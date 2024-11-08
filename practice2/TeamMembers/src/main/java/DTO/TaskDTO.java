package DTO;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class TaskDTO {
    @Id
    private ObjectId objectId;
    private String name;
    private String desc;
    private String priority;
    private String deadline;
    private boolean completed;


    public ObjectId getObjectId() {
        return objectId;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setObjectId(ObjectId objectId) {
        this.objectId = objectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
