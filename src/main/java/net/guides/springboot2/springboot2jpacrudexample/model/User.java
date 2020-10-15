package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="USER_REG_TBL")
	public class User {
	    @Id
	    @GeneratedValue
	    private Long id;
	   
		private String email;
	    private int experience;
	    private String domain;
	    
	    private String name;
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getDomain() {
			return domain;
		}
		public void setDomain(String domain) {
			this.domain = domain;
		}
	    
	}


