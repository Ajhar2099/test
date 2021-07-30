package com.ex.web.springBootBasicApp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//injet the properties for:coachName,teamName
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	// expose over "/" return "hello world"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World with the local time is" + LocalDateTime.now();
	}
	
	@GetMapping("/teamInfo")
	public String getTeamInfo() {
		return "coach name is " + coachName +"Team is "+ teamName;
	}
}
