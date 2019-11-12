package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repos.loginRepository;

@Service
public class loginService {

	@Autowired
	private loginRepository repo;
	
	public User add(User user)
	{
		return this.repo.save(user);
	}
	public List<User> findAll()
	{
		return this.repo.findAll();
	}
	public Optional<User> findById(long id)
	{
		return this.repo.findById(id);
	}
	
}
