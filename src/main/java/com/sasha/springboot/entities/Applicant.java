package com.sasha.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

import java.time.LocalDate;

@Entity
public class Applicant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String title;
	private String username;
	private String dob;
	private String location;
	private String personalInfo;
	private String video;
	private String jobCategory;
	private String skills;
	private String number;
	private Timestamp dateCreated;
	private Timestamp dateModified;
	
	public Applicant() {
		super();
	}

	//constructor
	public Applicant(String name, String title, String username, String dob, String location,
			String personalInfo, String video, String jobCategory, String skills, String number) {
		super();
		this.name = name;
		this.title = title;
		this.username = username;
		this.dob = dob;
		this.location = location;
		this.personalInfo = personalInfo;
		this.video = video;
		this.jobCategory = jobCategory;
		this.skills = skills;
		this.number = number;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
