  package com.dhakad;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Projection_In_QBC {

	public static void main(String[] args) {
		//projection : here projection means fetching selected column not all
		//without projection Query SELECT * FROM Table_Name;
		// Buy when we apply projection we fetch only selected column
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();	
		
		//first create a criteria object using session object
			Criteria criteria = s.createCriteria(Products.class);
			
		//create projection objects
		//
			ProjectionList plist=Projections.projectionList(); //projection list
			Projection p1=Projections.property("pid");
			Projection p2=Projections.property("price");
			plist.add(p1); plist.add(p2);					//add projection to plist
		    criteria.setProjection(plist);					//add projectionlist in to criteria
		    
		    List<Object[]> info=criteria.list();
		    for(Object[] ar:info) {
		    	for(Object val:ar) {
		    		System.out.println(val);
		    	}
		    	System.out.println("_________");
		    }
		s.close();
		
	}

}
