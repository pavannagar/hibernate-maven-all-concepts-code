package com.dhakad.ManyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	private int pcode;
	private String pname;
	private String title;
	@ManyToMany
	private List<Employee> employee;
	
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Projects(int pcode, String pname, String title) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.title = title;
	}





	@Override
	public String toString() {
		return "Projects [pcode=" + pcode + ", pname=" + pname + ", title=" + title + "]";
	}



	public Projects(int pcode) {
		super();
		this.pcode = pcode;
	}

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public List<Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}


	
	
	
}
