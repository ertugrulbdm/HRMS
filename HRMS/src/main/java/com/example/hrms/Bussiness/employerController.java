package com.example.hrms.Bussiness;

import com.example.hrms.DataAcces.employerRepository;
import com.example.hrms.Entities.employer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employer")
public class employerController {
    private employerRepository employerRepository;
    public employerController(employerRepository employerRepository){
        this.employerRepository=employerRepository;
    }
    @GetMapping("/findall")
    public List<employer> getAll(){
        return employerRepository.findAll();
    }

    @PostMapping("/add")
    public employer add(@RequestBody employer employer){
    employerLogin employerLogin=new employerLogin(employer);
    employerLogin.systemControl(employer);
    return employerRepository.save(employer);
    }
}
