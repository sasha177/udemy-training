package com.sasha.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sasha.springboot.entities.Applicant;


public interface ApplicantRepository extends JpaRepository<Applicant, Integer>{

}
