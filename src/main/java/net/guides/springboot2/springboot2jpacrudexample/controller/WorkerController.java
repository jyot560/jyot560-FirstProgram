package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.Workers;
import net.guides.springboot2.springboot2jpacrudexample.service.WorkerService;
import net.guides.springboot2.springboot2jpacrudexample.service.WorkerServiceMethod;

@RestController
@RequestMapping("/api")
public class WorkerController
{    
	@Autowired
	public WorkerService workerservice;
	@Autowired
	private WorkerServiceMethod workerservicemethod;
	
	
	@GetMapping("/test")
	public String myfirstfunction()
	{
		return "for test string";
	}
	
	@GetMapping("/test1")
	public Workers mysecondfunction()
	{
		Workers worker= new Workers(1,"jyoti","jyoti@gmail.com",20000);
		return worker;
	}
	
	@GetMapping("/test2")
	public Workers mythirdfunction()
	{
		return workerservice.serviceFunction();
	}
	
	@PostMapping("/save")
	public Workers saveWorkers( Workers worker)
	{
		return workerservice.saveWorkers(worker);
	}
	
	  @GetMapping("/getvalue/{id}")
	    public Workers getWorkers(@PathVariable(value = "id") Long id) {
	        return workerservicemethod.getWorkers(id);

}
	  @GetMapping("/getall")
	    public List<Workers> getAllWorkers() {
	        return workerservicemethod.getAllWorkers();
	    }
}
