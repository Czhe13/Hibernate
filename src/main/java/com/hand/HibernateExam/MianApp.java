package com.hand.HibernateExam;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MianApp {
	
public static void main(String[] args){
	MyInterceptor interceptor = new MyInterceptor();
	  
	Configuration conf = new Configuration().configure();
	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties())
			.build();
	SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
	Session session = sf.openSession( );
	Transaction tx=session.beginTransaction();
	
	System.out.println("请输入FirstName:");
	Scanner fn = new Scanner(System.in);
	String fname = fn.next();
	
	System.out.println("请输入LastName:");
	Scanner ln = new Scanner(System.in);
	String lname = ln.next();
	
	System.out.println("请输入Email:");
	Scanner em = new Scanner(System.in);
	String eml = em.next();
	
    Customer cus=new Customer();
  	cus.setFirst_name(fname);
  	cus.setLast_name(lname);
  	cus.setEmail(eml);
  	System.out.println("已经保存的数据如下:");
	System.out.println("ID:"+cus.getId());
	System.out.println("FirstName:"+cus.getFirst_name());
	System.out.println("Lastname:"+cus.getLast_name());
	System.out.println("Email:"+cus.getEmail());

	System.out.println("请输入要删除的Customer的ID:");
	Scanner i = new Scanner(System.in);
	int id = i.nextInt();
	String hql = "DELETE FROM Customer "  + 
            "WHERE id = :customer_id";
Query query = session.createQuery(hql);
query.setParameter("customer_id", id);

System.out.println("你输入的ID为"+id+"的Customer已經删除" );
	tx.commit();
	session.close();
	sf.close();
}
}
