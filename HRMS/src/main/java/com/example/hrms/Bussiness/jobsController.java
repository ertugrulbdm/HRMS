package com.example.hrms.Bussiness;

import com.example.hrms.DataAcces.jobsRepository;
import com.example.hrms.Entities.jobs;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class jobsController {
    private jobsRepository jobsRepository;
    public jobsController(jobsRepository jobsRepository){
        this.jobsRepository=jobsRepository;
    }

    @GetMapping("/getall")
    public List<jobs> getAll(){
        return jobsRepository.findAll();
    }

    @PutMapping("/{companyName}")
    public jobs companyJobsList(@PathVariable String companyName){
        return jobsRepository.findById(companyName).orElse(null);
    }
}
