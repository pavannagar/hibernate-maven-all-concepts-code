package com.dhakad;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {

	@Override
	public String toString() {
		return "Products [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	@Id
	int pid;
	String name;
	int price;
	
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Products(int pid, String name, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
