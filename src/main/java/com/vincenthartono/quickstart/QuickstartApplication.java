package com.vincenthartono.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // identifying a springboot app and marking the entry point.
public class QuickstartApplication {

	// this is the entry point for the app.
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

}
