package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
	public static void main(String[] args) {
		Laptop laptop =new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Student s=new Student();
		s.setName("Navin");
		s.setRollno(1);
		s.setMarks(50);
		//s.setLaptop(laptop);//@onetoone
		//s.getLaptop().add(laptop); //@onetomany
		
		laptop.getStudent().add(s);//@ManyToMany
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(s);
		
		session.getTransaction().commit();
		
		
}
}
