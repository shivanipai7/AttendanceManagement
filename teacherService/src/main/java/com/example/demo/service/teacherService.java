package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repos.teacherRepository;


@Service
public class teacherService {

	@Autowired
	private teacherRepository repo;
	
	public Student add(Student entity)
	{
		return this.repo.save(entity);
	}
	public List<Student> findAll()
	{
		return this.repo.findAll();
	}
	public void deleteById(long id)
	{
		 this.repo.deleteById(id);
	}
}

