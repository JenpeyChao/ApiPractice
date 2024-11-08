package com.example.TeamMembers.Service;


import DTO.TaskDTO;
import com.example.TeamMembers.Entity.TeamMembers;
import com.example.TeamMembers.FeignClient.TaskService;
import com.example.TeamMembers.Repository.TeamMemberDAO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamMembersService {
    @Autowired
    private TeamMemberDAO teamMemberDAO;

    @Autowired
    private TaskService taskService;

    public TeamMembers addMember(TeamMembers teamMember){
        return teamMemberDAO.insert(teamMember);
    }

    public TeamMembers updateMember(TeamMembers teamMember) {
        return teamMemberDAO.save(teamMember);
    }

    public TaskDTO getTaskById(ObjectId id){
        //Task Service's methods
        return taskService.getTaskById(id);
    }

    public TaskDTO updateTask(TaskDTO task){
        //Task Service's methods
        return taskService.updateTask(task);
    }

    public TaskDTO completeTask(ObjectId id){
        //Task Service's methods
        return taskService.completeTask(id);
    }

    public TeamMembers getMemberById(ObjectId member){
        //finds the team member by id
        Optional<TeamMembers>  res= this.teamMemberDAO.findById(member);
        return (res.isPresent())? res.get() :null;
    }

    public TeamMembers addTask(ObjectId teamMember, ObjectId task) {
        //add tasks to the team members list
        TeamMembers user = getMemberById(teamMember);
        if (user != null){
            user.getTasks().add(task);
            System.out.println("Task was added to the user");
            return this.teamMemberDAO.save(user);
        }
        return null;
    }

    public List<TeamMembers> getMembers() {
        //gets all the team members
        return this.teamMemberDAO.findAll();
    }

    public List<ObjectId> getTasksById(ObjectId teamMember) {
        //gets the team members list of tasks
        TeamMembers res = getMemberById(teamMember);
        if (res != null){
            return res.getTasks();
        }
        return null;
    }

    public TaskDTO updateTasks(ObjectId task) {
        //updates the task to complete
        System.out.println("The task is done");
        return completeTask(task);

    }

    public TeamMembers deleteTask(ObjectId teamMember, ObjectId task) {
        //deletes the task from the team members list
        TeamMembers res = getMemberById(teamMember);
        res.getTasks().remove(task);
        return this.teamMemberDAO.save(res);
    }

    public void deleteMember(ObjectId teamMember) {
        this.teamMemberDAO.deleteById(teamMember);
    }
}
