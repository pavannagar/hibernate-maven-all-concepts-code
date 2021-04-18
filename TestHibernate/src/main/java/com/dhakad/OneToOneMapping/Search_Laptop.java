package com.dhakad.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Search_Laptop {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();
		
		Laptop l1=s.get(Laptop.class, 2);
		
		System.out.println("Laptop code : "+l1.getLcode());
		System.out.println("Brand : "+l1.getBrand());
		System.out.println("Price : "+l1.getPrice());
		
		System.out.println("_______________________________");
		
		System.out.println("Emp Id : "+l1.getEmp().getEid());
		System.out.println("Emp Name : "+l1.getEmp().getEname());
		System.out.println("Emp Salary : "+l1.getEmp().getSal());
		
		
		s.close();

	}

}
