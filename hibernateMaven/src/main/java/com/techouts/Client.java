package com.techouts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client
{
	public static void main(String[] args)
	{
		StudentDetails s1=new StudentDetails();
		
		s1.setSid(1);
		s1.setSname("hema");
		s1.setSemail("hema@gmail.com");
		s1.setSmarks(500);
		
       Configuration cg=new Configuration();
		cg.configure("hibernate2.cfg.xml");
		
		SessionFactory sf=cg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		s.save(s1);
		
	}

}
