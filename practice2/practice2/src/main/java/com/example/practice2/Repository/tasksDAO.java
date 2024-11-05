package com.example.practice2.Repository;

import com.example.practice2.Entity.Tasks;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tasksDAO extends MongoRepository<Tasks, ObjectId> {
}
