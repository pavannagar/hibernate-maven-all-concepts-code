package com.dhakad;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Filteration_In_QBC {

	public static void main(String[] args) {

		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();	
		
		//first create a criteria object using session object
			Criteria criteria = s.createCriteria(Products.class);
			
		//Restriction class contain all methods for fitlteration
		//and it return the object of criterion object
			//Criterion ctr1=Restrictions.lt("price", 2500);
			//criteria.add(ctr1);
			
			ArrayList<String> names=new ArrayList<>();
			names.add("mobile");
			names.add("watch");
		 Criterion ctr2=Restrictions.in("name", names);
			criteria.add(ctr2);
			
		//list method return List of Entity Objects
			List<Products> products=criteria.list();
		//this products object contain all rows 	
			
		//print all rows by using for each loop
			for(Products pr:products) {
				System.out.println(pr.getPid()+" "+pr.getName()+" "+pr.getPrice());
				System.out.println("__________________________");
	
			}
			s.close();
		

	}

}
