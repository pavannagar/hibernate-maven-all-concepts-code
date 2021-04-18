package com.dhakad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();	
		
		//QBI with the help of this we can fetch only single row by id
		Products p=s.get(Products.class, 2);
		System.out.println(p.getPid()+" , "+p.getName());
		s.close();		
	}

}
