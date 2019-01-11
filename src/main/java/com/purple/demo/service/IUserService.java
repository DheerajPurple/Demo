package com.purple.demo.service;

import java.util.List;

import com.purple.demo.dto.UserDTO;
import com.purple.demo.pojo.UserPojo;

public interface IUserService {

	public void saveUser(UserPojo user);
	public List<UserDTO> findUsers();
	public UserDTO findUserByID(int id);
	public UserPojo service(int id);
}
