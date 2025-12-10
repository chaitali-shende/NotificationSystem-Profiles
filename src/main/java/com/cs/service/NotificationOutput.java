package com.cs.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NotificationOutput {
	private String type;
    private String recipient;
    private String message;
}
