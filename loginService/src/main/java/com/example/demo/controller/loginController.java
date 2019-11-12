package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.User;
import com.example.demo.service.loginService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
@Slf4j
public class loginController {

	@Autowired
	private Environment env;
	@Autowired
	private loginService service;
	
	@PostMapping(path="/login",produces="application/json",consumes="application/json")
	public User add(@RequestBody User entity)
	{
		return this.service.add(entity);
	}
	@GetMapping
	public List<User> findAll()
	{
		log.info(env.getProperty("local.server.port"));
		return this.service.findAll();
	}
	@GetMapping(path="/login/id/{userId}")
	public String findById(@PathVariable("userId")long id)
	{
		String found="Failed Login";
		Optional<User> response=this.service.findById(id);
		if(response.isPresent())
		{
			found="Login SuccessFul";
		}
		return found;
	}
	
}
