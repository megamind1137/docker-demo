package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

	@RequestMapping("/")
    public String home() {
        return "Dockerizing Spring Boot Application";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
