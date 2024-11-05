package com.example.practice.Controller;

import com.example.practice.Entity.People;
import com.example.practice.Service.PeopleServices;
import com.netflix.discovery.converters.Auto;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PeopleController {
    @Autowired
    public PeopleServices peopleServices;

    @PostMapping("/people")
    public People addPeople(@RequestBody People people){
        return peopleServices.addPeople(people);
    }
    @DeleteMapping("/people/{id}")
    public void removePeople(@PathVariable ObjectId id){
        this.peopleServices.removePeople(id);
    }
    @PutMapping("/people")
    public People updatePeople(@RequestBody People people){
        return peopleServices.updatePeople(people);
    }
}
