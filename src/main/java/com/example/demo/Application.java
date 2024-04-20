package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/hello")
	public String home() {
		return "Hello ci-cd!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/thanhhungg/test_cicd.git
//git push -u origin main