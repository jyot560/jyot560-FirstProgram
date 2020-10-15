package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Bloguser {
	  public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @Column
	    private String userName;
	    @Column
	    private String password;
	    @Column
	    private String email;
		public Bloguser(Long id, String userName, String password, String email) {
			super();
			this.id = id;
			this.userName = userName;
			this.password = password;
			this.email = email;
		}
		public Bloguser() {
			// TODO Auto-generated constructor stub
		}


	    
}
