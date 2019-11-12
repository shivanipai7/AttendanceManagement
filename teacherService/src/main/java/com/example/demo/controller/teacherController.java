package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.teacherService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
@Slf4j
public class teacherController {
	@Autowired
	private Environment env;
	
	@Autowired
	private teacherService service;
	
	@GetMapping(path="/students")
	public List<Student> findAll()
	{
		log.info(env.getProperty("local.server.port"));
		return this.service.findAll();
	}
	@PostMapping(path="/students",produces="application/json",consumes="application/json")
	public Student add(@RequestBody Student entity)
	{
		return this.service.add(entity);
	}
	@GetMapping(path="/students/id/{rollNumber}")
	public void deleteById(@PathVariable("rollNumber")long id)
	{
		 this.service.deleteById(id);
	}

}
