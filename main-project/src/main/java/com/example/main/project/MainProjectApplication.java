package com.example.main.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class MainProjectApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MainProjectApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> helloWorld()
	{
		RestTemplate restTemplate = new RestTemplate();
		String sideCarResponse = restTemplate.getForObject("http://localhost:8081", String.class);
		return ResponseEntity.ok("Main"+sideCarResponse);
	}
}
