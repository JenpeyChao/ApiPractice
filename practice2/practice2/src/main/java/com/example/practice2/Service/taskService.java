package com.example.practice2.Service;
import com.example.practice2.Entity.Tasks;

import com.example.practice2.Repository.tasksDAO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskService {
    @Autowired

    private tasksDAO tasksDAO;
    public Tasks addTask(Tasks task){
        return this.tasksDAO.insert(task);
    }

    public Tasks updateTask(Tasks task){
        return this.tasksDAO.save(task);
    }

    public void deleteTasks(ObjectId id) {
        this.tasksDAO.deleteById(id);
    }

    public List<Tasks> getTasks() {
        return this.tasksDAO.findAll();
    }
}
