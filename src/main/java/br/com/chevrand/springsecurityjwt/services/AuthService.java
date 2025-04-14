package br.com.chevrand.springsecurityjwt.services;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
	
	private final JwtService service;
	
	public AuthService(JwtService jwtService) {
		this.service = jwtService;
	}

	public String authenticate(Authentication authentication) {
		return service.generateToken(authentication);
	}
}
