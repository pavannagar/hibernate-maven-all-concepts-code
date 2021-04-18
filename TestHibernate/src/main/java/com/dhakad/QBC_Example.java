package com.dhakad;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QBC_Example {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();	
		
		//first create a criteria object using session object
			Criteria criteria = s.createCriteria(Products.class);
		//list method return List of Entity Objects
			List<Products> products=criteria.list();
		//this products object contain all rows 	
			
		//print all rows by using for each loop
			for(Products pr:products) {
				System.out.println(pr.getPid()+" "+pr.getName());
				System.out.println("__________________________");
	
			}
			s.close();
	}

}
