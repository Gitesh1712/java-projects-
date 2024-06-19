package com.gitesh.DemoHib;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Configuration cfg=new Configuration().configure("hibernate.xml");
//        
//        SessionFactory sf=cfg.buildSessionFactory();
    	
    	SessionFactory factory=HibernateUtil.getSessionFactory();
//    	System.out.println(factory);
//    	Student s1=new Student();
//    	s1.setId(1);
//    	s1.setName("Gitesh");
//    	s1.setMail("giteshb260@gmail.com");
//    	s1.setAddress("Noida");
//    	
//    	
//    	Session session=factory.openSession();
//    	
//    	Transaction tx=session.beginTransaction();
//    	session.save(s1);
//    	tx.commit();
//    	session.close();
    	
    	Employee e1=new Employee();
    	e1.setEmpName("Gitesh");
    	e1.setEmail("gb260@gmail.com");
    	e1.setJoiningDate(new Date());
    	e1.setSalary((double) 1000000);
    	e1.setStatus(true);
    	e1.setToken("token1");
    	
    	Session session=factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(e1);
    	tx.commit();
    	session.close();
        
    	
    }
}
