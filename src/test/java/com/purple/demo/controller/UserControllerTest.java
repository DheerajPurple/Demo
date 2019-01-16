package com.purple.demo.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;
import com.purple.demo.DemoApplication;
import com.purple.demo.dto.UserDTO;
import com.purple.demo.pojo.UserPojo;



@RunWith(SpringRunner.class)
@ContextConfiguration(classes=DemoApplication.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${local.server.port}")
	String port;
	

//	@Test
//	public void testSaveUser() {
//		
//		UserPojo saveUser=restTemplate.getForObject("http://localhost:"+port+"/saveUser", UserPojo.class);
//		System.out.println(saveUser);
//		
//	}

	@Test
	public void testFindUsers() {
		
	Object users = restTemplate.getForObject("http://localhost:"+port+"/findUsers", Object.class);
	String usersString = new Gson().toJson(users);
	Assert.assertEquals("[{\"id\":1,\"firstName\":\"dk\",\"lastName\":\"dk\",\"age\":27},{\"id\":2,\"firstName\":\"dj\",\"lastName\":\"dj\",\"age\":27},{\"id\":3,\"firstName\":\"kd\",\"lastName\":\"kd\",\"age\":29}]", usersString);
	
	}

	@Test
	public void testFindUserByID(){
		
		
	
		UserPojo user=restTemplate.getForObject("http://localhost:"+port+"/findUser/1", UserPojo.class);
		
		String userString = new Gson().toJson(user);
		//System.out.println(userString);
	Assert.assertEquals("{\"id\":1,\"firstName\":\"dk\",\"lastName\":\"dk\",\"age\":27}", userString);
		
		
	}

//	@Test
//	public void testService() {
//		fail("Not yet implemented");
//	}

}
