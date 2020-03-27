package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Workers
{   
    @Id
	private long id;
	private String name;
	private String emailid;
	private long salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
   public Workers(long id, String name, String emailid, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.salary = salary;
	}
	public Workers() {
		
		
	}
	
	@Override
	public String toString() {
		return "Workers[id=" + id + ", firstName=" + name + ", salary=" + salary + ", emailId=" + emailid+ "]";
			
	}
	
	
	
	
	
	
	
	
	

}
