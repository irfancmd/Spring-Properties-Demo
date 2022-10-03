package com.example.springboot.demo.mySpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The "SpringBootApplication" annotation consists of some basic annotations like
// EnableAutoConfiguration, ComponentScan etc.
@SpringBootApplication
public class MySpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAppApplication.class, args);
	}

}
