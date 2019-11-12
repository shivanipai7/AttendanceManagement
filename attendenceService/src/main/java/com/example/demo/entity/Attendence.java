package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="attendence11")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Attendence {
 @Id
 private long attendenceId;
 private long rollNumber;
 private String name;
 private LocalDate absentDate;
 
}
