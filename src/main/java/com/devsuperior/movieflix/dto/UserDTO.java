package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.User;

public class UserDTO {


	private Long id;
	private String name;
	private String email;
	private String password;
	
	public UserDTO() {
		
	}

	public UserDTO(Long id, String name, String email, String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public UserDTO(User entity) {
		
		id=entity.getId();
		name=entity.getName();
		email=entity.getEmail();
		password=entity.getPassword();
	}

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

	public String getPassword() {
		return password;
	}
	
	
}
