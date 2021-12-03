package com.example.hrms.Bussiness;

import com.example.hrms.DataAcces.*;
import org.springframework.web.bind.annotation.*;
import com.example.hrms.Entities.jobSeekers;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("/user")
public class controller {
    private jobsSeekersRepository jobsSeekersRepository;

    public controller(jobSekeersLoginRepository jobSekeersRepository){
        this.jobSekeersRepository=jobSekeersRepository;
    }

    @GetMapping("/list")
    @Transactional
    public List<jobSeekers> getAllUsers(){
        return jobSekeersRepository.findAll();
    }

    @PostMapping("/add")
    public jobSeekers addUser(@RequestBody jobSeekers jobSeekers) throws Exception {
        jobSekeersLogin userLogin=new jobSekeersLogin();
        userLogin.mernis(jobSeekers);
        return jobSekeersRepository.save(jobSeekers);
    }

}
