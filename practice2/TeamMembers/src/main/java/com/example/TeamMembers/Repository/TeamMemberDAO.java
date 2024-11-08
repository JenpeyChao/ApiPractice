package com.example.TeamMembers.Repository;

import com.example.TeamMembers.Entity.TeamMembers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMemberDAO extends MongoRepository<TeamMembers, ObjectId> {
}
