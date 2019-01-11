package com.purple.demo.dto;

import java.io.Serializable;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class UserDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty
	private int id;
	@JsonProperty
	private String firstName;
	@JsonProperty
	private String lastName;
	@JsonProperty
	private int age;

}
