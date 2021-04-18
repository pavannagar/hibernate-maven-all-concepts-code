package com.dhakad.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Projects_Entry {

	public static void main(String[] args) {
		
		

		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession(); 
		
		Employee e1=new Employee(1);
		Employee e2=new Employee(2);
		Employee e3=new Employee(3);
		
		List<Employee> el1=new ArrayList<>(); el1.add(e1); el1.add(e2);
		List<Employee> el2=new ArrayList<>(); el2.add(e2); el2.add(e3);
		List<Employee> el3=new ArrayList<>(); el3.add(e1); el3.add(e3);
		
		Projects p1=new Projects(11, "abc", "hello"); p1.setEmployee(el1);
		Projects p2=new Projects(12, "abc", "hello"); p2.setEmployee(el2);
		Projects p3=new Projects(13, "abc", "hello"); p3.setEmployee(el3);
				
		Transaction tr=s.beginTransaction();
		
		s.save(p1); s.save(p2); s.save(p3);
	
		tr.commit();
		s.close();
	}

}
