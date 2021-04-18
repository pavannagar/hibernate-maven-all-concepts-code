package com.dhakad;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Projection_In_HQL {

	public static void main(String[] args) {
	
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();	
											//  ***NOTE***
		String hql="select pid,price from Products"; //here in your query Entity name is used 
										  // so same class/entity name use (i make a mistake)
										 //  i use products instead of Products P is Capital
										// and dont use ("Select from Products")
										// select is use when we fetch selected column
		Query query=s.createQuery(hql);
		List<Object[]> object=query.list();
		//first way to display data
		for(Object[] info:object) {
			
			System.out.println("Product ID    :"+info[0]);
			System.out.println("Product Price :"+info[1]);
			System.out.println("______________________________________");
		}
		
		/*
		 * 
		 * second way to display data
		for(Object[] ar:object) {
			for(Object pr:ar) {
				System.out.println(pr);
			
			}
			System.out.println("_________");
		} */
		s.close();
	}

}
