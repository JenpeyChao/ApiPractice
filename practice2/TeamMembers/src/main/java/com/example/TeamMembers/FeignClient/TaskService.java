package com.example.TeamMembers.FeignClient;

import DTO.TaskDTO;
import org.bson.types.ObjectId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//allows the TeamMember service to use the API's from Tasks
@FeignClient(name = "practice2",url = "http://localhost:8080")
public interface TaskService {

    @GetMapping("/task/{id}")
    TaskDTO getTaskById(@PathVariable ObjectId id);

    @PutMapping("/task")
    TaskDTO updateTask(@RequestBody TaskDTO task);

    @PutMapping("/task/{id}")
    TaskDTO completeTask(@PathVariable ObjectId id);


}
