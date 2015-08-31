package com.hand.HibernateExam;

import java.util.Set;

public class Country {
private int country_id;
private String country;
private Set<City> city ;
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getCountry_id() {
	return country_id;
}
public void setCountry_id(int country_id) {
	this.country_id = country_id;
}

public Set<City> getCity() {
	return city;
}
public void setCity(Set<City> city) {
	this.city = city;
}


}
