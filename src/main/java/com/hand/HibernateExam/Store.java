package com.hand.HibernateExam;

import java.util.Set;

public class Store {
private int Store_id;
private Set<City> ct ;
public Set<City> getCt() {
	return ct;
}
public void setCt(Set<City> ct) {
	this.ct = ct;
}
public int getStore_id() {
	return Store_id;
}
public void setStore_id(int store_id) {
	Store_id = store_id;
}


}
