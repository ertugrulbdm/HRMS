package com.example.hrms.DataAcces;

import com.example.hrms.Entities.employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employerRepository extends JpaRepository<employer,String> {
}
