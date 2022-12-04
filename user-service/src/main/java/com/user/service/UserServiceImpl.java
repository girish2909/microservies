package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.dto.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private RestTemplate restTemplate;

	List<User> userList = List.of(
				new User(1L, "girish", null),
				new User(2L, "ashish", null),
				new User(3L, "manish", null),
				new User(4L, "amit", null)
			);
	
	@Override
	public User getUser(Long id) {
		User fetchedUser =  userList.stream().filter(user -> user.getId().equals(id)).findFirst().get();
		fetchedUser.setContacts(restTemplate.getForObject("http://contact-service/contact/"+id, List.class));
		return fetchedUser;
	}

}
