package com.dhakad.auto_key_generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {

	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	@SequenceGenerator(name="scode_generator",sequenceName = "scode_gen",allocationSize = 1,initialValue = 201)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "scode_generator")
	private int id;
	private String name;
	private String batch;
	
	
	
	public Student(String name, String batch) {
		super();
		this.name = name;
		this.batch = batch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	
	
	
}
