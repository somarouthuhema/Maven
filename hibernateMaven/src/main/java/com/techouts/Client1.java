package com.techouts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client1 {
	public static void main(String[] args)
	{
		Configuration cg=new Configuration();
		
		cg.configure("hibernate2.cfg.xml");
		
		SessionFactory sf=cg.buildSessionFactory();
		Session s=sf.openSession();
		Employee e1=new Employee();
		
		e1.setEid(1);
		e1.setEname("hemachandra");
		e1.setEsal(500);
		
       
		
		
		
		s.save(e1);
		
	}


}
