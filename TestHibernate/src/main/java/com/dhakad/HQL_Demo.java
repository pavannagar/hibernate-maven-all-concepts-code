 package com.dhakad;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_Demo {

	public static void main(String[] args) {
	
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();	
											//  ***NOTE***
		String hql="from Products where pid>2"; //here in your query Entity name is used 
										  // so same class/entity name use (i make a mistake)
										 //  i use products instead of Products P is Capital
										// and dont use ("Select from Products")
										// select is use when we fetch selected column
		Query query=s.createQuery(hql);		
		List<Products> products=query.list();
		for(Products p:products) {
			System.out.println(p);
		}
		s.close();
	}

}
