package com.ravago.unter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ravago.unter.service.api.AuthenticationService;
import com.ravago.unter.service.api.LoginCommand;
import com.ravago.unter.service.api.LoginException;
import com.ravago.unter.service.api.LogoutCommand;

@Controller
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody LoginCommand c) {
		try {
			return ResponseEntity.ok().body(authenticationService.login(c));
		} catch(LoginException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public ResponseEntity<Void> logout(@RequestBody LogoutCommand c) {
		authenticationService.logout(c);
		return ResponseEntity.ok().build();
	}
}
