package com.gitesh.DemoHib;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
public class FetchApp {
	
	public static void main(String[] args)
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Employee e1=session.get(Employee.class, 1);
		System.out.println(e1);
		
	}
}
