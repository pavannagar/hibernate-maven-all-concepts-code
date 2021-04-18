package com.dhakad.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp {

	@Id
	private int eid;
	private String ename;
	private int sal;
	@OneToOne
	private Laptop laptop;

	
	
	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public Emp() {
		super();
	}

	
	public Emp(int eid) {
		super();
		this.eid = eid;
	}


	public Emp(int eid, String ename, int sal, Laptop laptop) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}
	
	
}
