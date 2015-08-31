package com.hand.HibernateExam;



public class Customer {
	
private int id;
private int store_id;
private String first_name;
private String last_name;
private String email;
//private Address address;


/*public Address getAddress() {
	return address;
}*/
/*public void setAddress(Address address) {
	this.address = address;
}*/
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getStore_id() {
	return store_id;
}
public void setStore_id(int store_id) {
	store_id=1;
	this.store_id = store_id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
