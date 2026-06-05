package com.codingshuttle;

import com.codingshuttle.service.Notification;
import com.codingshuttle.service.SmsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner{

	
	final Notification notification;
	
	
	
	public Module1IntroductionApplication(Notification notification) {
		this.notification = notification;
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started...");
		
		notification.send("Kartik");
		
	}

}
