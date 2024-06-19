package com.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.env.internal.DefaultSchemaNameResolver.SchemaNameResolverJava17Delegate;

public class App {
	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		//SAVE-CREATE
//		Address a1=new Address(1, "Permanet", "RaeBareli");
//		Address a2=new Address(2,"Office Address","Noida");
//		
//		List<Address> list=new ArrayList<Address>();
//		list.add(a1);
//		list.add(a2);
//		
//		EmpDtls emp=new EmpDtls();
//		emp.setId(1);
//		emp.setName("Gitesh");
//		emp.setAddress(list);
//		
//		a1.setEmp(emp);
//		a2.setEmp(emp);
//		
//		
//		Session session=factory.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		session.save(a1);
//		session.save(a2);
//		session.save(emp);
//		tx.commit();
//		
//		System.out.println("Insert Success");
//		
		//FETCH-READ
		Session session=factory.openSession();
		EmpDtls emp= session.get(EmpDtls.class, 1);
//		
//		System.out.println(emp.getName());
		
		
//		for(Address ad:emp.getAddress())
//		{
//			System.out.println(ad.getAddressType()+" "+ad.getAddress());
//		}
		
//		Address a1=session.get(Address.class, 1);
//		
//		System.out.println(a1.getEmp().getId()+" "+ a1.getEmp().getName());
//		System.out.println(a1.getAddressType()+" "+a1.getAddress());
//			
		
		session.close();
		factory.close();
		
	}
}
