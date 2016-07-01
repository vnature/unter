package com.ravago.unter.service.api;

public interface AuthenticationService {

	String login(LoginCommand login);
	
	void logout(LogoutCommand logout);
}
