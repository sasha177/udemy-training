package com.sasha.springboot.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email;
	private String companyName;
	private String brief;
	private String address;
	private String state;
	private String country;
	private String number;
	private String logo;
	private Timestamp dateCreated;
	private Timestamp dateModified;
	
	public Company() {
		super();
	}

	//constructor
	public Company(String email, String companyName, String brief, String address, String state, String country,
			String number, String logo) {
		super();
		this.email = email;
		this.companyName = companyName;
		this.brief = brief;
		this.address = address;
		this.state = state;
		this.country = country;
		this.number = number;
		this.logo = logo;
		this.dateCreated = new Timestamp(System.currentTimeMillis());
		this.dateModified = new Timestamp(System.currentTimeMillis());
	}
	
	//getters and setters below
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Timestamp getDateModified() {
		return dateModified;
	}
	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

}
