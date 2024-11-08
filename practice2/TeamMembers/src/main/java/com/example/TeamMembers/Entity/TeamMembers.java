package com.example.TeamMembers.Entity;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;


@Getter
@Setter
public class TeamMembers {
    @Id
    private ObjectId objectId;
    private String name;
    private String team;
    private List<ObjectId> tasks;

    public ObjectId getObjectId() {
        return objectId;
    }


    public List<ObjectId> getTasks() {
        return tasks;
    }

    public void setTasks(List<ObjectId> tasks) {
        this.tasks = tasks;
    }
}
