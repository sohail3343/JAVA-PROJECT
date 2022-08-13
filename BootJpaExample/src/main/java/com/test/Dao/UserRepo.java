package com.test.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);

}