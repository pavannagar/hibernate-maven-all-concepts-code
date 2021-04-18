package com.dhakad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		Configuration config=new Configuration().configure();
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession();
		
		
		
		Products p1=new Products(1, "mobile",2200);
		Products p2=new Products(2, "laptop",25000);
		Products p3=new Products(3, "cooler",3000);
		Products p4=new Products(4, "watch",540);
		Products p5=new Products(5, "pen",20);
		
		Transaction tr=s.beginTransaction();
		s.save(p1);s.save(p2);s.save(p3);s.save(p4);s.save(p5);
		tr.commit();
		s.close();
		}catch(Exception e) {
			System.out.println(e);
		}		
		
	}

}
