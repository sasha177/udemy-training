package com.sasha.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sasha.springboot.entities.Job;
import com.sasha.springboot.repos.JobRepository;

@RestController
public class JobRestController {
	
	@Autowired
	JobRepository repository;
	

	@RequestMapping(value = "/jobs/", method = RequestMethod.GET)
	public List<Job> getProducts() {
		return repository.findAll();
	}

	@RequestMapping(value = "/jobs/{id}", method = RequestMethod.GET)
	public Job getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}

	@RequestMapping(value = "/jobs/", method = RequestMethod.POST)
	public Job createProduct(@RequestBody Job applicant) {
		return repository.save(applicant);
	}

	@RequestMapping(value = "/jobs/", method = RequestMethod.PUT)
	public Job updateProduct(@RequestBody Job product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/jobs/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
