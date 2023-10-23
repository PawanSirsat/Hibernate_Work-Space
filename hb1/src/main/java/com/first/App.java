package com.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Server Start...." );
        
        Configuration con = new Configuration().configure();
        SessionFactory cf  = con.buildSessionFactory();
        Session session = cf.openSession();
        Transaction transaction = session.beginTransaction();
        
        Student student = new Student();
        
        student.setFirstName("Dipak");
        student.setLastName("Patil");
        student.setMarks(53);
        
        session.save(student);
        
        transaction.commit();
        session.close();
    }
}
