package com.dhakad.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Cascading_Example {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession(); 
		
		/*cascading ke liye account table me 
		 *  @OneToMany(mappedBy = "account" ,cascade = CascadeType.ALL)
		 *  List<Cards> cards;
														
		*/

		Account a1=new Account("ac1", "abc", 2345);
		Account a2=new Account("ac2", "xyz", 5645);
		
		Cards c1=new Cards("c1", "pl", 200000, new Account("Ac1"));
		Cards c2=new Cards("c2", "gl", 300000, new Account("Ac1"));
		Cards c3=new Cards("c3", "sl", 250000, new Account("Ac2"));
	
	
		List<Cards> l1=new ArrayList<>(); l1.add(c1); l1.add(c2);
		List<Cards> l2=new ArrayList<>(); l2.add(c2); l1.add(c3);
		
		a1.setCards(l1); a2.setCards(l2);
		
					
		Transaction tr=s.beginTransaction();
		s.save(a1); s.save(a2);
		
		
		tr.commit();
		s.close();
		
	}

}
