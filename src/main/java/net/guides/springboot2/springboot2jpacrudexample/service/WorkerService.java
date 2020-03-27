package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.springboot2.springboot2jpacrudexample.model.Workers;
import net.guides.springboot2.springboot2jpacrudexample.repository.WorkerRepository;


@Service
public class WorkerService implements  WorkerServiceMethod 
{
	@Autowired
	WorkerRepository workerrepository;
	

public Workers serviceFunction()
{
	Workers worker=new Workers(1,"sagar","sagar@gmail.com",200000);
			return worker;
	
}
	

    @Override
    public Workers saveWorkers(Workers workers) {
        return workerrepository.save(workers);
    }

    @Override
    public Workers updateWorkers(Workers workers) {
        return workerrepository.save(workers);
    }


    @Override
    public List<Workers> getAllWorkers() {
        return (List<Workers>) workerrepository.findAll();
    }

    @Override
    public Workers getWorkers(Long id) {
        return workerrepository.findById(id).get();
    }

    @Override
    public void deleteWorkers(Long id) {
    	workerrepository.deleteById(id);
    }


}
