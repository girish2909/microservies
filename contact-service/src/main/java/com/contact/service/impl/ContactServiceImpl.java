package com.contact.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> contactList = List.of(
			 new Contact(4L,"manish@gmail.com",1L),
			 new Contact(1L,"girish@gmail.com",2L),
			 new Contact(2L,"ashish@gmail.com",2L),
			 new Contact(3L,"vineet@gmail.com",2L),
			 new Contact(3L,"vineet@gmail.com",3L),
			 new Contact(3L,"others@gmail.com",4L)
			);

	@Override
	public List getContacts(Long userId) {
		List filteredList = contactList.stream().filter(c -> c.getUserId().equals(userId)).collect(Collectors.toList());
		return filteredList;
	}

}
