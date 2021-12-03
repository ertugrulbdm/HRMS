package com.example.hrms.DataAcces;

import com.example.hrms.Entities.jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jobsRepository extends JpaRepository<jobs,String> {
}
