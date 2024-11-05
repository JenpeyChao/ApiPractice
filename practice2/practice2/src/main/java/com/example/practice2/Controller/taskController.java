package com.example.practice2.Controller;
import com.example.practice2.Entity.Tasks;

import com.example.practice2.Service.taskService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class taskController {
    @Autowired
    private taskService taskService;

    @PostMapping("/task")
    public Tasks addTasks(@RequestBody Tasks task){
        return taskService.addTask(task);
    }
    @PutMapping("/task")
    public Tasks updateTasks(@RequestBody Tasks task){
        return taskService.updateTask(task);
    }
    @DeleteMapping("/task/{id}")
    public void deleteTasks(@PathVariable ObjectId id){
        taskService.deleteTasks(id);
    }
    @GetMapping("/task")
    public List<Tasks> getTasks(){
        return taskService.getTasks();
    }
}
