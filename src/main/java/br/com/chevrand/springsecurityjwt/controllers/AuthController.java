package br.com.chevrand.springsecurityjwt.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.chevrand.springsecurityjwt.services.AuthService;

@RestController
@RequestMapping("auth")
public class AuthController {
	
	private final AuthService service;
	
	public AuthController(AuthService authService) {
		this.service = authService;
	}

	@PostMapping
	public ResponseEntity<String> authenticate(Authentication authentication) {
		return ResponseEntity.ok(service.authenticate(authentication));
	}
}
