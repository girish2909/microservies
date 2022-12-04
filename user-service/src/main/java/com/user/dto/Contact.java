package com.user.dto;

public class Contact {

	private Long id;
	private String email;
	private Long userId;
	
	public Contact(Long id, String email, Long userId) {
		super();
		this.id = id;
		this.email = email;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
}
