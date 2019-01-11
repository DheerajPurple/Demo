package com.purple.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.purple.demo.dto.UserDTO;
import com.purple.demo.pojo.UserPojo;
import com.purple.demo.repository.UserRepository;


@Service
public class UserService implements IUserService{

	//test
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDTO userDTO;
	
	@Autowired
	private List<UserDTO> listDTO;
		//as
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public void saveUser(UserPojo user) {
			userRepository.save(user);
	}

	//list
	public List<UserDTO> findUsers() {
		List<UserPojo> users = userRepository.findAll();
		String usersString = new Gson().toJson(users);
		
		try
		{
			listDTO = objectMapper.readValue(usersString,objectMapper.getTypeFactory().constructCollectionType(List.class, UserDTO.class));
	
		}
		catch(Exception e) {
			
		}
		
		return listDTO;
	}


	//test
	public UserDTO findUserByID(int id) {
		UserPojo user = userRepository.findById(id).orElse(null);
		String userString = new Gson().toJson(user);
		
		try
		{
		userDTO = objectMapper.readValue(userString, UserDTO.class);
	
		}
		catch(Exception e) {
			
		}
		return userDTO;
	}



	public UserPojo service(int id) {
				
		return restTemplate.getForObject("http://172.17.0.3:81/find/"+id+"", UserPojo.class);
	}

}
