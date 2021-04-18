package com.dhakad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RemoveProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();	
		
		Products p=new Products();
		p.setPid(1);
		Transaction tr=s.beginTransaction();
		s.delete(p);
		tr.commit();
		s.close();
		
	}

}
