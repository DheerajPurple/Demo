package com.purple.demo.service;

import java.util.List;
import com.purple.demo.dto.UserDTO;
import com.purple.demo.pojo.UserPojo;

public interface IUserService {
//sample
	 void saveUser(UserPojo user);
	 List<UserDTO> findUsers();
	 UserDTO findUserByID(int id);
	 UserPojo service(int id);
}
