package com.sasha.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sasha.springboot.entities.Applicant;
import com.sasha.springboot.repos.ApplicantRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ApplicantRestController {
	
	@Autowired
	ApplicantRepository repository;
	
	//rest controller stuff
	@RequestMapping(value = "/applicants/", method = RequestMethod.GET)
	public List<Applicant> getProducts() {
		return repository.findAll();
	}

	@RequestMapping(value = "/applicants/{id}", method = RequestMethod.GET)
	public Applicant getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}

	@RequestMapping(value = "/applicants/", method = RequestMethod.POST)
	public Applicant createProduct(@RequestBody Applicant applicant) {
		return repository.save(applicant);
	}

	@RequestMapping(value = "/applicants/", method = RequestMethod.PUT)
	public Applicant updateProduct(@RequestBody Applicant product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/applicants/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
