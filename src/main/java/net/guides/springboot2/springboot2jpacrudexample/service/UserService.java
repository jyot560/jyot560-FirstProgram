package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.guides.springboot2.springboot2jpacrudexample.model.User;

import net.guides.springboot2.springboot2jpacrudexample.repository.UserRepository;

@Service
@Transactional
public class UserService 
{
	     @Autowired
	     UserRepository userrepository;
	     
	     
	 	public List<User> saveUser(List<User> user)
	 	{
	 		return (List<User>) userrepository.saveAll(user);
        }
	 	
	 	public List<User> findByEmail(String email)
	 	{
			return (List<User>) userrepository.findByEmail(email);
		}
	 	public List<User>findAlluser()
	 	{
	 		return (List<User>) userrepository.findAll();
	 	}
	 

		public void  deleteById(Long id) {
		userrepository.deleteById(id);
			
		}
	 	
}


