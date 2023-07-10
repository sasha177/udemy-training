package com.sasha.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasha.springboot.entities.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
