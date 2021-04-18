package com.dhakad.ManyToManyMapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Search_Projects {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession(); 
		Projects p=s.get(Projects.class, 12);
		System.out.println("pcode : "+p.getPcode());
		System.out.println("pname :"+p.getPname());
		System.out.println("title :"+p.getTitle());
		System.out.println("_________________________________");
		List<Employee> employee=p.getEmployee();
		
		for(Employee e:employee) {
			System.out.println(e);
			
		}
		s.close();

	}

}
