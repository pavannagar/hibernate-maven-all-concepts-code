package com.dhakad.auto_key_generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Teacher {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="tcode_generator",sequenceName = "tcode_gen",allocationSize = 1,initialValue = 501)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tcode_generator")

	int id;
	String name;
	String batch;
	public Teacher() {
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
	public Teacher(String name, String batch) {
		super();
		this.name = name;
		this.batch = batch;
	}
	
	
	
}
