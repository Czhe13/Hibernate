package com.hand.HibernateExam;

import org.hibernate.EmptyInterceptor;
import java.io.Serializable;




import org.hibernate.type.Type;
@SuppressWarnings("serial")
public class MyInterceptor extends EmptyInterceptor {
	
	  public boolean onSave(Object entity,
              Serializable id,
              Object[] state,
              String[] propertyNames,
              Type[] types) {
 if ( entity instanceof Customer) {
    System.out.println("Create Operation");
    return true; 
 }
 return false;
}
	
}
