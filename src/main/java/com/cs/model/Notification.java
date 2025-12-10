package com.cs.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notification {
	@NotNull(message = "id cannot be null")
	private int id;
	
    @NotBlank(message = "Message cannot be empty")
    @Size(min = 5, message = "Message must be at least 5 characters")
	private String message;
    
    @NotBlank(message = "Message cannot be empty")
	private String recipient;
}
