package com.dhakad.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Search_Emp {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();
		
		Emp e1=s.get(Emp.class, 11);
		System.out.println("Emp Id : "+e1.getEid());
		System.out.println("Emp Name : "+e1.getEname());
		System.out.println("Emp Salary : "+e1.getSal());
		System.out.println("_______________________________");
		System.out.println("Laptop code : "+e1.getLaptop().getLcode());
		System.out.println("Brand : "+e1.getLaptop().getBrand());
		System.out.println("Price : "+e1.getLaptop().getPrice());
		
		s.close();
	}

}
