package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import net.guides.springboot2.springboot2jpacrudexample.model.Workers;

public interface WorkerServiceMethod 
{
	Workers saveWorkers(Workers workers);
	Workers updateWorkers(Workers workers);
	    List<Workers> getAllWorkers();
	    Workers getWorkers(Long id);
	    void deleteWorkers(Long id);

}
