package com.sasha.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sasha.springboot.entities.Applicant;
import com.sasha.springboot.entities.Company;
import com.sasha.springboot.repos.CompanyRepository;

@RestController
public class CompanyRestController {
	
	@Autowired
	CompanyRepository repository;

	//rest controller stuff
	@RequestMapping(value = "/companies/", method = RequestMethod.GET)
	public List<Company> getProducts() {
		return repository.findAll();
	}

	@RequestMapping(value = "/companies/{id}", method = RequestMethod.GET)
	public Company getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}

	@RequestMapping(value = "/companies/", method = RequestMethod.POST)
	public Company createProduct(@RequestBody Company applicant) {
		return repository.save(applicant);
	}

	@RequestMapping(value = "/companies/", method = RequestMethod.PUT)
	public Company updateProduct(@RequestBody Company product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/companies/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
