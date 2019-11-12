package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendence;
import com.example.demo.repos.attendenceRepository;


@Service
public class attendenceService {

	@Autowired
	private attendenceRepository repo;
	
	public Attendence add(Attendence entity)
	{
		return this.repo.save(entity);
	}
	public List<Attendence> findAll()
	{
		return this.repo.findAll();
	}
	public List<Attendence> findByRollNumber(long rn)
	{

		 return this.repo.findByRollNumber(rn);
	}
	
}
