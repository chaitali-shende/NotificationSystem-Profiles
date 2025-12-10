package com.cs.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.cs.model.Notification;

@Service
@Profile("default")
public class DefaultNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		System.out.println("\n================================");
		System.out.println("       NOTIFICATION RESULT      ");
		System.out.println("================================\n");
		System.out.println("No active profile selected. Default Notification → " +
                n.getMessage());
	}
}
