package com.sasha.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasha.springboot.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
