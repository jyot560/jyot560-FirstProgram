package net.guides.springboot2.springboot2jpacrudexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.dto.RegisterRequest;
import net.guides.springboot2.springboot2jpacrudexample.model.Bloguser;
import net.guides.springboot2.springboot2jpacrudexample.service.AuthService;

@RestController
@RequestMapping("/api3")
public class AuthController {
	private AuthService authservice;
	
	@PostMapping("/signup")
	public ResponseEntity<Bloguser> signup(@RequestBody Bloguser  registerRequest) {
		authservice.signup(registerRequest);
	        return new ResponseEntity<Bloguser>(HttpStatus.OK);
     
	}

}
