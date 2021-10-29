package com.example.reactsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ReactsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactsbApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "welcome home!";
	}
}
