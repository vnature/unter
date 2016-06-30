package com.ravago.unter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class AppConfig extends WebMvcAutoConfiguration{
	public static void main(String [] args){
		SpringApplication.run(AppConfig.class, args);
	}
}
