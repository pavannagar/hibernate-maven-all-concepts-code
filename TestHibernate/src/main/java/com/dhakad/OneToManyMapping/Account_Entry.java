package com.dhakad.OneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Account_Entry {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration().configure();
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession(); 
		
		Account ac1=new Account("Ac1", "AAA", 2000);
		Account ac2=new Account("Ac2", "BBB", 3000);
		
		Transaction tr=s.beginTransaction();
		s.save(ac1); s.save(ac2);
		tr.commit();
		s.close();
		
		
		
	}

}
