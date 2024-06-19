package com.gitesh.Curd_App;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session =factory.openSession();
        
        //CREATE
//        Student create-Save
//        Student s1=new Student();
//        s1.setName("Gitesh");
//        s1.setAddress("Noida");
//        s1.setEmail("gb260@gmail");
//        s1.setCollegeName("IMS");
//        Student s2=new Student();
//        s2.setName("Gitesh2");
//        s2.setAddress("Noida2");
//        s2.setEmail("gb260@gmail2");
//        s2.setCollegeName("IMS2");
//        
//        
//        Transaction tx=session.beginTransaction();
//        session.save(s1);
//        session.save(s2);
//        tx.commit();
//        session.close();
//        factory.close();
//        System.out.println("Student registered Successfully");
        
        //READ 
        //All rows
        List<Student>list=session.createQuery("from Student", Student.class).list();
        list.forEach(e-> System.out.println(e));
        session.close();
        factory.close();
        //single row
//        Student s1=session.get(Student.class, 1);
//        System.out.println(s1);
        //UPDATE 
//        Student s1=session.get(Student.class, 1);
//        s1.setAddress("Delhi");
//        Transaction tx=session.beginTransaction();
//        session.save(s1);
//        tx.commit();
        
        //DELETE
//        Student s2=session.get(Student.class, 2);
//        Transaction tx=session.beginTransaction();
//        session.delete(s2);
//        tx.commit();
//        session.close();
//        factory.close();
        
        
    }
}
