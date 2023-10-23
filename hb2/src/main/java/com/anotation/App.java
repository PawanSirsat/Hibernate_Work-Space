package com.anotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration =  new Configuration().configure();
    	SessionFactory sFactory = configuration.buildSessionFactory();
    	Session session = sFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Employee employee = new Employee();
    	
    	employee.setElocation("Pune");
    	employee.setEname("Pawan");
    	employee.setSalary(8500);
    	
    	session.save(employee);
    	
    	transaction.commit();  
    	session.close();
    	
    }
}
