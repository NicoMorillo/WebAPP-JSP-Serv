package com.webAPPDB.model;

import java.util.Date;

public class Regis {

	private String customer_id;
	private Date registered;
	private String email;
	private String title;
	private String first_name;
	private String last_name;
	private String address_line1;
	private String address_line2;
	private String city;
	private String postcode;
	private String telephone;
	private String site;
	
	public Regis() {
		// TODO Auto-generated constructor stub
	}

	public Regis(String customer_id, Date registered, String email, String title, String first_name, String last_name,
			String address_line1, String address_line2, String city, String postcode, String telephone, String site) {
		super();
		this.customer_id = customer_id;
		this.registered = registered;
		this.email = email;
		this.title = title;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.postcode = postcode;
		this.telephone = telephone;
		this.site = site;
		
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public Date getRegistered() {
		return registered;
	}

	public void setRegistered(Date registered) {
		this.registered = registered;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}




	@Override
	public String toString() {
		return "Regis [customer_id=" + customer_id + ", registered=" + registered + ", email=" + email + ", title=" + title
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", address_line1=" + address_line1
				+ ", address_line2=" + address_line2 + ", city=" + city + ", postcode=" + postcode + ", telephone="
				+ telephone + ", site="+ site +"]";
	}

	
}