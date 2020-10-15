package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Bloguser;

@Repository
public interface BloguserRepository extends JpaRepository<Bloguser, Long> {

    Optional<Bloguser> findByUserName(String username);

	
	
}
