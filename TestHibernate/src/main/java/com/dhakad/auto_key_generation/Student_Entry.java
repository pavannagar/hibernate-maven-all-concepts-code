package com.dhakad.auto_key_generation;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Entry {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession(); 
		
		Student s1=new Student("pavan", "t1");
		Student s2=new Student("vishal", "t3");
		
		Transaction tr=s.beginTransaction();
		s.save(s1); s.save(s2);
		tr.commit();
		s.close();
		
	}

}
