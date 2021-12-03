package com.example.hrms.DataAcces;

import com.example.hrms.Entities.jobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

interface jobsSeekersRepository extends JpaRepository<jobSeekers, String>{
}
