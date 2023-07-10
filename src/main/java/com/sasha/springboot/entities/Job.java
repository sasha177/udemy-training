package com.sasha.springboot.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;
import javax.persistence.Id;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int jobId;
	private String email;
	private String title;
	private String region;
	private String location;
	private String jobType;
	private String jobCategory;
	private String description;
	private String jobUrl;
	private String companyName;
	private String logo;
	private String amount;
	private String slogan;
	private Timestamp dateCreated;
	private Timestamp dateModified;
	
	//constructor
	
	
	
	public Job(int jobId, String email, String title, String region, String location, String jobType, String jobCategory,
			String description, String jobUrl, String companyName, String logo, String amount, String slogan) {
		super();
		this.jobId = jobId;
		this.email = email;
		this.title = title;
		this.region = region;
		this.location = location;
		this.jobType = jobType;
		this.jobCategory = jobCategory;
		this.description = description;
		this.jobUrl = jobUrl;
		this.companyName = companyName;
		this.logo = logo;
		this.amount = amount;
		this.slogan = slogan;
		this.dateCreated = new Timestamp(System.currentTimeMillis());
		this.dateModified = new Timestamp(System.currentTimeMillis());
	}
	
	
	public Job() {
		super();
	}


	//getters and setters below
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getjobId() {
		return jobId;
	}
	public void setjobId(int jobId) {
		this.jobId = jobId;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getJobUrl() {
		return jobUrl;
	}
	public void setJobUrl(String jobUrl) {
		this.jobUrl = jobUrl;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
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
