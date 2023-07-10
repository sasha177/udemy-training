package com.sasha.springboot.controllers;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sasha.springboot.entities.Applicant;
import com.sasha.springboot.entities.Company;
import com.sasha.springboot.entities.Job;
import com.sasha.springboot.repos.ApplicantRepository;
import com.sasha.springboot.repos.CompanyRepository;
import com.sasha.springboot.repos.JobRepository;

@Controller
public class GeneralController {
	
	@Autowired
	ApplicantRepository repository;
	
	@Autowired
	CompanyRepository repository1;
	
	@Autowired
	JobRepository repository2;
	
	
	//general controller stuff
	@RequestMapping("/home/")
	public ModelAndView displayhomepage() {
		ModelAndView mav = new ModelAndView("homePage");
		return mav;
	}
	
	@RequestMapping("/main/")
	public ModelAndView displaymainpage() {
		ModelAndView mav = new ModelAndView("main");
		return mav;
	}
	
	@RequestMapping("/login/")
	public ModelAndView displayloginpage() {
		ModelAndView mav = new ModelAndView("loginPage");
		return mav;
	}
	
	//job
	
	@RequestMapping("/jobForm/")
	public ModelAndView displayJobForm() {
		ModelAndView mav = new ModelAndView("jobRegistration");
		Job job = new Job();
		mav.addObject("job",job);
		return mav;
	}
	
	@RequestMapping("/saveJob/")
	public ModelAndView saveJob(@ModelAttribute Job jobTemp) {
		ModelAndView mav = new ModelAndView("savedjob");
		Job job = new Job(jobTemp.getjobId(), jobTemp.getEmail(), jobTemp.getTitle(), jobTemp.getRegion(), jobTemp.getLocation(), jobTemp.getJobType(), 
				jobTemp.getJobCategory(), jobTemp.getDescription(), jobTemp.getJobUrl(), jobTemp.getCompanyName(), jobTemp.getLogo(), jobTemp.getAmount(), jobTemp.getSlogan());
		repository2.save(job);
		return mav;
	}
	
	//company
	@RequestMapping("/companyForm/")
	public ModelAndView displayCompanyForm() {
		ModelAndView mav = new ModelAndView("companyRegistration");
		Company company = new Company();
		mav.addObject("company",company);
		return mav;
	}
	
	@RequestMapping("/saveCompany/")
	public ModelAndView saveCompany(@ModelAttribute Company companyTemp) {
		ModelAndView mav = new ModelAndView("savedCompany");
		Company company = new Company(companyTemp.getEmail(), companyTemp.getCompanyName(), companyTemp.getBrief(), companyTemp.getAddress(), companyTemp.getState(), 
				companyTemp.getCountry(), companyTemp.getNumber(), companyTemp.getLogo());
		repository1.save(company);
		return mav;
	}
	
	@RequestMapping("/companyLogin/")
	public ModelAndView displayloginpage2() {
		ModelAndView mav = new ModelAndView("loginPage2");
		return mav;
	}
	
	
	
	//applicant controller
	@RequestMapping("/applicantForm/")
	public ModelAndView displayApplicantForm() {
		ModelAndView mav = new ModelAndView("userRegistration");
		Applicant applicant = new Applicant();
		mav.addObject("applicant",applicant);
		return mav;
	}
	
	@RequestMapping("/saveApplicant/")
	public ModelAndView saveApplicant(@ModelAttribute Applicant applicantTemp) {
		ModelAndView mav = new ModelAndView("savedApplicant");
		Applicant applicant = new Applicant(applicantTemp.getName(), applicantTemp.getTitle(), applicantTemp.getUsername(), applicantTemp.getDob(), 
				applicantTemp.getLocation(), applicantTemp.getPersonalInfo(), applicantTemp.getVideo(), applicantTemp.getJobCategory(), applicantTemp.getSkills(), 
				applicantTemp.getNumber());
		repository.save(applicant);
		return mav;
	}
	
	@RequestMapping("/applicantLogin/")
	public ModelAndView displayloginpage1() {
		ModelAndView mav = new ModelAndView("loginPage2");
		return mav;
	}
}
