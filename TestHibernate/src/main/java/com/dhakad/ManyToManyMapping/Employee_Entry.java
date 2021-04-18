package com.dhakad.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Entry {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession(); 
		
		Projects p1=new Projects(11);
		Projects p2=new Projects(12);
		Projects p3=new Projects(13);
		
		List<Projects> pl1=new ArrayList<>(); pl1.add(p1); pl1.add(p2);
		List<Projects> pl2=new ArrayList<>(); pl2.add(p2); pl2.add(p3);
		List<Projects> pl3=new ArrayList<>(); pl3.add(p1); pl3.add(p3);
		
		
		Employee e1=new Employee(1, "AAA", 34333); e1.setProjects(pl1);
		Employee e2=new Employee(2, "BBB", 44340); e2.setProjects(pl2);
		Employee e3=new Employee(3, "CCC", 33424); e3.setProjects(pl3);
				
		Transaction tr=s.beginTransaction();
		
		s.save(e1);s.save(e2);s.save(e3);
		tr.commit();
		s.close();
	}

}
