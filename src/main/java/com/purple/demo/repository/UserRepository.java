package com.purple.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purple.demo.pojo.UserPojo;

@Repository
public interface UserRepository extends JpaRepository<UserPojo, Integer> {

}
