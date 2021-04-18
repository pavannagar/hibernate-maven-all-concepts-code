package com.dhakad.OneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Cards_Entry {

	public static void main(String[] args) {
	

		Configuration config=new Configuration().configure();
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession(); 
		
		Cards c1=new Cards("c1", "pl", 200000, new Account("Ac1"));
		Cards c2=new Cards("c2", "gl", 300000, new Account("Ac1"));
		Cards c3=new Cards("c3", "sl", 250000, new Account("Ac2"));
		
		Transaction tr=s.beginTransaction();
		s.save(c1);s.save(c2);s.save(c3);
		tr.commit();
		s.close();
		
		
		
		
		
		
	}

}
