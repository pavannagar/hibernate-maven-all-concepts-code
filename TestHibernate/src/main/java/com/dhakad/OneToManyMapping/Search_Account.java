package com.dhakad.OneToManyMapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Search_Account {

	public static void main(String[] args) {
	

		Configuration config=new Configuration().configure();
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession(); 
		Account account=s.get(Account.class, "Ac1");
		System.out.println("Account no : "+account.getAno());
		System.out.println("Account name : "+account.getAname());
		System.out.println("Account balance : "+account.getBalance());
		System.out.println("_______________________________");
		List<Cards> cards=account.getCards();
		for(Cards c:cards) {
			System.out.println("Card no : "+c.getCno());
			System.out.println("Card name : "+c.getCtype());
			System.out.println("Card limit : "+c.getClimit());
		
		}
		
		s.close();
		
		
	}

}
