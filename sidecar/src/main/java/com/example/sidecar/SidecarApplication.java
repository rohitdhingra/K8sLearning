package com.example.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> sideCarHello()
	{
		return ResponseEntity.ok("SideCar Hello World");
	}

}
