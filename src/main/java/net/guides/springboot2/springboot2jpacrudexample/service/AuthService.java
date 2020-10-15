package net.guides.springboot2.springboot2jpacrudexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import net.guides.springboot2.springboot2jpacrudexample.dto.RegisterRequest;
import net.guides.springboot2.springboot2jpacrudexample.model.Bloguser;
import net.guides.springboot2.springboot2jpacrudexample.repository.BloguserRepository;

@Service
public class AuthService {
	@Autowired
	private BloguserRepository bloguserrepository;
	
public void signup(Bloguser registerRequest)
{
	Bloguser user = new Bloguser();
	user.setUserName(registerRequest.getUserName());
	user.setPassword(registerRequest.getPassword());
	user.setEmail(registerRequest.getEmail());
	bloguserrepository.save(user);
}


}


