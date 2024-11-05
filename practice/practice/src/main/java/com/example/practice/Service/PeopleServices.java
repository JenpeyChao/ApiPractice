package com.example.practice.Service;

import com.example.practice.Entity.People;
import com.example.practice.Repository.PeopleDAO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServices {
    @Autowired
    private PeopleDAO peopleDAO;

    public People addPeople(People person){
        return this.peopleDAO.insert(person);
    }
    public void removePeople(ObjectId id){
        this.peopleDAO.deleteById(id);

    }
    public People updatePeople(People person){
        return this.peopleDAO.save(person);
    }
}
