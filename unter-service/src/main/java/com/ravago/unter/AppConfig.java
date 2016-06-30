package com.ravago.unter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class AppConfig {
	public static void main(String [] args){
		SpringApplication.run(AppConfig.class, args);
	}
}
