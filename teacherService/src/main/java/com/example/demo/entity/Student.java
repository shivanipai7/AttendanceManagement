package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student1234")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	private long rollNumber;
	private String studentName;
	private String studentAddress ;
	private long phoneNumber;
	

}
