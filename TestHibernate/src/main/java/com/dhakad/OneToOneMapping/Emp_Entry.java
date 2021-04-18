package com.dhakad.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emp_Entry {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession(); 
		
		Emp e1=new Emp(11, "pavan", 200000000, new Laptop(1));
		Emp e2=new Emp(12, "dhakad", 2300000, new Laptop(2));
		Transaction tr=s.beginTransaction();
		s.save(e1); s.save(e2);
		tr.commit();
		s.close();
		
	}

}
