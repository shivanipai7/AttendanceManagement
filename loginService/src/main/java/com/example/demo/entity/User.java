package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user1234")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private long userId;
	private String password;
	
}
