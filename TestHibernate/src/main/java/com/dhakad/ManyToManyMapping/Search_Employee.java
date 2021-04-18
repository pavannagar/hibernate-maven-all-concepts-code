package com.dhakad.ManyToManyMapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Search_Employee {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession(); 
		Employee e=s.get(Employee.class, 1);
		System.out.println("Employee id : "+e.getEid());
		System.out.println("Employee name :"+e.getEname());
		System.out.println("Employee salary :"+e.getSalary());
		System.out.println("_________________________________");
		List<Projects> projects=e.getProjects();
		
		for(Projects p:projects) {
			System.out.println(p);
			
		}
		s.close();
	}

}
