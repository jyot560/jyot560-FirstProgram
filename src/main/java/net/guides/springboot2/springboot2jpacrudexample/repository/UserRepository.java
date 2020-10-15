package net.guides.springboot2.springboot2jpacrudexample.repository;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import net.guides.springboot2.springboot2jpacrudexample.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Id>{

	 User findByEmail(String email);

	void deleteById(Long id);

	
	
}
