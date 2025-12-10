package com.cs.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.cs.NotificationSystemApplication;
import com.cs.model.Notification;
import com.cs.service.NotificationService;

import jakarta.validation.Validation;
import jakarta.validation.Validator;

@Component
public class Runner implements CommandLineRunner{

    private final NotificationSystemApplication notificationSystemApplication;

	@Autowired
	private NotificationService service;

	private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    Runner(NotificationSystemApplication notificationSystemApplication) {
        this.notificationSystemApplication = notificationSystemApplication;
    }

	public void run(String... args) throws Exception {

		Notification n = new Notification(1, "Welcome to system!", "Chaitali");

		// Manual validation for demonstration
		var violations = validator.validate(n);
		if (!violations.isEmpty()) {
			violations.forEach(v -> System.out.println(v.getMessage()));
			return;
		}
		service.sendNotification(n);
	}
}
