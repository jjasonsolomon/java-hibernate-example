package com.lti.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App {
public static void main(String...args){
	Configuration config=new Configuration().configure();
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
	
	SessionFactory factory =config.buildSessionFactory(builder.build());
	Session session = factory.openSession();
	Employee emp = new Employee();
	emp.setEmpName("Jas");
	emp.setBranch("TSI");
	session.beginTransaction();
	session.save(emp);
	session.getTransaction().commit();
	
	
}
}
