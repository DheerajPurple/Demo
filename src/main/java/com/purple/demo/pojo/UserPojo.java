package com.purple.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.*;

@Entity
@Data
public class UserPojo {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int age;
}
