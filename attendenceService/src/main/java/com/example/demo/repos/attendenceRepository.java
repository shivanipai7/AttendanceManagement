package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Attendence;


public interface attendenceRepository extends JpaRepository<Attendence,Long> {

	public List<Attendence> findByRollNumber(long id);
    
}
