package com.ravago.unter.service.impl;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravago.unter.domain.Carrier;
import com.ravago.unter.domain.CarrierSession;
import com.ravago.unter.repository.api.CarrierRepository;
import com.ravago.unter.repository.api.CarrierSessionRepository;
import com.ravago.unter.service.api.AuthenticationService;
import com.ravago.unter.service.api.LoginCommand;
import com.ravago.unter.service.api.LoginException;
import com.ravago.unter.service.api.LogoutCommand;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private CarrierRepository carrierRepository;
	
	@Autowired
	private CarrierSessionRepository carrierSessionRepository;
	
	@Override
	public String login(LoginCommand login) {
		Carrier c = carrierRepository.findByname(login.getUserName());
		if (c == null
				|| !c.getPassword().equals(login.getPassword())) {
			throw new LoginException();
		}
		String sessionId = UUID.randomUUID().toString();
		CarrierSession s = new CarrierSession();
		s.setCarrier(c);
		s.setSessionId(sessionId);
		carrierSessionRepository.save(s);
		return s.getSessionId();
	}

	@Override
	public void logout(LogoutCommand logout) {
		CarrierSession s = carrierSessionRepository.findBySessionId(logout.getSessionId());
		carrierSessionRepository.delete(s);
	}

	
}
