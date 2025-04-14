package br.com.chevrand.springsecurityjwt.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("private")
public class PrivateController {

	@GetMapping
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok("Hello world! You are authenticated.");
	}
}
