package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface loginRepository extends JpaRepository<User, Long> {
	

}
