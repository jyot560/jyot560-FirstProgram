package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.guides.springboot2.springboot2jpacrudexample.model.Workers;
import net.guides.springboot2.springboot2jpacrudexample.repository.WorkerRepository;
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
	@Autowired
	public WorkerRepository workerrepository;
	
	
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
	  
	  @PostMapping("/setdata")
	  public List<Workers> setWorkers()
	  {
		  List<Workers> workers=new ArrayList<Workers>();
		 
		  Workers w=new Workers();
		  w.setId(20);
		  w.setName("Atul");
		  w.setEmailid("Atul.dinkar@gmail.com");
		  w.setSalary(100000);
		  workers.add(w);
		return workerrepository.save(workers);
		  
	  }
	  
	  @DeleteMapping("/delete/{id}")
	    public void deleteWorker(@PathVariable(name = "id") Long id) 
	  {
		  workerservicemethod.deleteWorkers(id);
	  }
	  
	  
	  
	  
		  @PostMapping("/Workers")
	          public  Workers newWorkers(@RequestBody Workers newWorkers) {
		      Workers w = new Workers();
			  w.setId(5);
			  w.setName("sidd");
			  w.setEmailid("sidd@gmail.com");
			  w.setSalary(100000);
		    return workerrepository.save(w);
		  }
		  

		  @PostMapping("/setworkers")
	          public  Workers setData( Workers newWorkers) {
		      Workers w = new Workers(5,"raj","raj@gmail.com",2000000);
			
		    return workerrepository.save(w);
		  }
		  
		  
		  @RequestMapping("/welcome")
			public ModelAndView firstPage() {
				return new ModelAndView("welcome");
			}
	  
}
