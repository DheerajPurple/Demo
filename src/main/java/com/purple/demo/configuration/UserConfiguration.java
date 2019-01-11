package com.purple.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
public class UserConfiguration {

//	@Bean
//	@Primary
//	public UserDTO userDTO()
//	{
//		return new UserDTO();
//	}
	//test
	@Bean
	@Primary
	public ObjectMapper objectMapper()
	{
		return new ObjectMapper();
	}
	
	@Bean
	@Primary
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
