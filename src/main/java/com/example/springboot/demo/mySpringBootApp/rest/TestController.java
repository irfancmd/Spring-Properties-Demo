package com.example.springboot.demo.mySpringBootApp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	// Injecting properties from the application.properties file
	@Value("${coach.name}")
	private String coachName;
	
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!. The time is: " + LocalDateTime.now() + ".";
	}
	
	@GetMapping("/weather")
	public String getWeather() {
		return "Today is sunny.";
	}
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach name: " + coachName + ", Team name: " + teamName + ".";
	}
}
