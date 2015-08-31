package com.hand.HibernateExam;


import java.util.Set;

public class Address {
private int id;
private String address;

//private Set<Customer> cus ;
private Store store;

public Store getStore() {
	return store;
}
public void setStore(Store store) {
	this.store = store;
}
/*public Set<Customer> getCus() {
	return cus;
}
public void setCus(Set<Customer> cus) {
	this.cus = cus;
}*/
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
