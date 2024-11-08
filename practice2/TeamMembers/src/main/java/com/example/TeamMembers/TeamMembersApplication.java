package com.example.TeamMembers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TeamMembersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamMembersApplication.class, args);
	}

}
