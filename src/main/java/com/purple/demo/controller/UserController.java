package com.purple.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purple.demo.dto.UserDTO;
import com.purple.demo.pojo.UserPojo;
import com.purple.demo.service.IUserService;






@RestController
public class UserController {

	@Autowired
	private IUserService userService;
	
	@PostMapping("/saveUser")
	public void saveUser(@RequestBody UserPojo user)
	{
		userService.saveUser(user);
	}
	
	@GetMapping("/findUsers")
	public List<UserDTO> findUsers()
	{
		return userService.findUsers();
	}
	
	@GetMapping("/findUser/{id}")
	public UserDTO findUserByID(@PathVariable int id)
	{
		return userService.findUserByID(id);
	}
	
	@GetMapping("/service/{id}")
	public UserPojo service(@PathVariable int id)
	{
		return userService.service(id);
	}
	
	
}
