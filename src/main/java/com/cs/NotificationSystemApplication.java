package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationSystemApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(NotificationSystemApplication.class);
        app.setWebApplicationType(org.springframework.boot.WebApplicationType.NONE); // Disable Tomcat
        app.run(args);
	}
}
