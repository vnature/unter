package com.ravago.unter.service.api;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("Username or password is wrong");
	}
	
}
