package com.codingshuttle.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name="notification.type", havingValue="sms")
public class SmsService implements Notification {

	@Override
	public void send(String message) {
		System.out.println("SMS sent - "+message);
	}

}
