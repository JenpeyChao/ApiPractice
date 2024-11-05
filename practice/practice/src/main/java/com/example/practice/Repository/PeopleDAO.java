package com.example.practice.Repository;

import com.example.practice.Entity.People;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleDAO extends MongoRepository<People, ObjectId> {

}
