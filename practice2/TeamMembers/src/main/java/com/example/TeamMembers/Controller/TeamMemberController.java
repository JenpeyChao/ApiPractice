package com.example.TeamMembers.Controller;

import DTO.TaskDTO;
import com.example.TeamMembers.Entity.TeamMembers;
import com.example.TeamMembers.Service.TeamMembersService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamMemberController {

    @Autowired
    private TeamMembersService teamMembersService;

    @GetMapping("/team")
    public List<TeamMembers> getMembers(){
        return teamMembersService.getMembers();
    }

    @PostMapping("/team")
    public TeamMembers addMember(@RequestBody TeamMembers teamMember){
        return teamMembersService.addMember(teamMember);
    }

    @PutMapping("/team")
    public TeamMembers updateMember(@RequestBody TeamMembers teamMember){
        return teamMembersService.updateMember(teamMember);
    }
    @DeleteMapping("/team")
    public TeamMembers deleteTask(@RequestParam("tm") ObjectId teamMember, @RequestParam("t") ObjectId task){
        return teamMembersService.deleteTask(teamMember,task);
    }
    @DeleteMapping("/team/{member}")
    public void deleteMember(@PathVariable ObjectId member){
        teamMembersService.deleteMember(member);
    }
    @PutMapping("/team/addTask")
    public TeamMembers addTask(@RequestParam("tm") ObjectId teamMember, @RequestParam("t") ObjectId task){
        return teamMembersService.addTask(teamMember,task);
    }
    @GetMapping("/team/{teamMember}")
    public List<ObjectId> getTasksbyId(@PathVariable ObjectId teamMember){
        return teamMembersService.getTasksById(teamMember);
    }
    @PutMapping("/team/updateTask/{task}")
    public TaskDTO UpdateTask(@PathVariable ObjectId task){
        return teamMembersService.updateTasks(task);
    }
}
