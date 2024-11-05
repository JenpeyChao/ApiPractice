package com.example.practice2.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
public class Tasks {
    @Id
    private ObjectId objectId;
    private String name;
    private String desc;
    private String priority;
    private String deadline;
    private boolean completed;
}
