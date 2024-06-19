package com.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppMain {
	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
//		Address a1=new Address();
//		a1.setAddress("Delhi");
//		a1.setId(1);
//		
//		EmpDtls emp=new EmpDtls();
//		emp.setId(1);
//		emp.setName("Gitesh");
//		emp.setAddress(a1);
//		
		Transaction tx=session.beginTransaction();
//		session.save(a1);
//		session.save(emp);
		
//		EmpDtls emp=session.get(EmpDtls.class,1);
//		System.out.println(emp.getName());
//		System.out.println(emp.getAddress().getAddress());
//		
		
		
		Address a1=session.get(Address.class, 1);
		System.out.println(a1.getEmp().getName());
		System.out.println(a1.getAddress());
		
		tx.commit();
		
		
		
		session.close();
		factory.close();
	}
}
