package com.dhakad.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Laptop_Entry {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession(); 
		
		Laptop l1=new Laptop(1, "hp", 55000);
		Laptop l2=new Laptop(2, "dell", 44000);
		Transaction tr=s.beginTransaction();
		s.save(l1); s.save(l2);
		tr.commit();
		s.close();
		
		
	}

}
