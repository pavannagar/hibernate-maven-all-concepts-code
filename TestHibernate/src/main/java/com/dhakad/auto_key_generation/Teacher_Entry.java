package com.dhakad.auto_key_generation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Teacher_Entry {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession(); 
		
		Teacher t1=new Teacher("abc", "xy");
		Teacher t2=new Teacher("aaa", "pq");
		Transaction tr=s.beginTransaction();
		s.save(t1);s.save(t2);
		tr.commit();
		s.close();
	}

}
