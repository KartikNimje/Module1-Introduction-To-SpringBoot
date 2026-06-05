package com.codingshuttle.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name="notification.type", havingValue="email")
public class EmailService implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Email sent - "+message);
	}

}
