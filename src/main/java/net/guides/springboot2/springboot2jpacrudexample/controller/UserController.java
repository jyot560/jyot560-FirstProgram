 package net.guides.springboot2.springboot2jpacrudexample.controller;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.User;
import net.guides.springboot2.springboot2jpacrudexample.repository.UserRepository;
import net.guides.springboot2.springboot2jpacrudexample.service.UserService;

@RestController
@RequestMapping("/api2")
@CrossOrigin(origins = "*")
public class UserController 
{
	 @PersistenceContext
	    protected EntityManager entityManager;

	
	@Autowired
    UserService userservice;
	@Autowired
	UserRepository userrepository;	
	
	
	@RequestMapping("/")
	public String home()
	{
		return "hello.jsp";
	}
	
	
	
	
  @PostMapping("/register")
  public String register(@RequestBody User user)
  {
	  userrepository.save(user);
	return "Hi " + user.getName() + " your registration process successfully completed";
  }
  

  @GetMapping("/getAllUsers")
  public List<User> findAllUsers() {
      return userservice.findAlluser();
  }

  @GetMapping("/findUser/{email}")
  public List<User> findUser(@PathVariable String email) {
      return userservice.findByEmail(email);
  }
 
 @DeleteMapping("/cancel/{id}")
  public List<User> cancelRegistration(@PathVariable(name = "id") Long id) {
	  userrepository.deleteById(id);
      return userservice.findAlluser();
  }

 
 @DeleteMapping("/delete/{id}")
  public List<User> deleteUser(@PathVariable Long id) {
	 userservice.deleteById(id);
	 return userservice.findAlluser();
     
  }
	
}
