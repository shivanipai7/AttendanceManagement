package com.example.demo.controller;

import java.util.ArrayList;
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
import com.example.demo.entity.Attendence;
import com.example.demo.service.attendenceService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "*")
@Slf4j
public class attendenceController {

	@Autowired
	private Environment env;
	
	@Autowired
	private attendenceService service;
	
	@GetMapping(path="/attendence")
	public List<Attendence> findAll()
	{
		log.info(env.getProperty("local.server.port"));
		return this.service.findAll();
	}
	@PostMapping(path="/attendence",produces="application/json",consumes="application/json")
	public Attendence add(@RequestBody Attendence entity)
	{
		return this.service.add(entity);
	}
	@GetMapping(path="/attendence/roll/{rollNumber}")
	public List<Attendence> findByRollNumber(@PathVariable("rollNumber")long rn)
	{
		 return this.service.findByRollNumber(rn);
	}
	@GetMapping(path="/attendence/fine/{rollNumber}")
	public long findFineAmount(@PathVariable("rollNumber")long rn)
	{
		List<Attendence> list=new ArrayList<>();
		list=findByRollNumber(rn);
		long penalty;
		penalty=list.size()*100;
		return penalty;		
	}
	
}
