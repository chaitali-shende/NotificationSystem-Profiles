package com.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.cs.model.Notification;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Profile("prod")
@Slf4j
public class PushNotificationService implements NotificationService {

	@Autowired
	private ObjectMapper mapper;

	@Override
	public void sendNotification(Notification n) {
		try {
			System.out.println("\n================================");
			System.out.println("       NOTIFICATION RESULT      ");
			System.out.println("================================\n");
			String json = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(new NotificationOutput("EMAIL", n.getRecipient(), n.getMessage()));
			log.info(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
