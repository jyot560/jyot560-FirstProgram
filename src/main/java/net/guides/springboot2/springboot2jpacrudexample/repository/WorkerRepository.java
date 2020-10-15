package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Workers;

@Repository
public interface WorkerRepository extends JpaRepository<Workers,Long>{

	List<Workers> save(List<Workers> l1);

	

}
