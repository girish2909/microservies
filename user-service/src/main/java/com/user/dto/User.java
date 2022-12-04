package com.user.dto;

import java.util.List;

public class User {

	private Long id;
	private String name;
	private List contacts;
	public User(Long id, String name, List contacts) {
		super();
		this.id = id;
		this.name = name;
		this.contacts = contacts;
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
	public List getContacts() {
		return contacts;
	}
	public void setContacts(List contacts) {
		this.contacts = contacts;
	}
	
	
}
