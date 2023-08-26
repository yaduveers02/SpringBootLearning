package com.example.JPA.Entiry;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	
	
	@jakarta.persistence.Id
	//Auto make 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column
	private String name;
	@Column
	private String email;
	
	public User(int id, String name, String email) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	
	
	
	
	

}
