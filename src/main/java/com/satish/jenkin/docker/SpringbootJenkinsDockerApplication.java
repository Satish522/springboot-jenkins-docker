package com.satish.jenkin.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDockerApplication.class, args);
	}
	
	@GetMapping("/docker")
	public String welcome() {
		return "Publish to Docker";
	}
}
