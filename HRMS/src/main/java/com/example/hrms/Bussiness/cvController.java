package com.example.hrms.Bussiness;

import com.example.hrms.Bussiness.cvGraude.cvGraudation;
import com.example.hrms.DataAcces.cvRepository;
import com.example.hrms.Entities.cv;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class cvController {
    private cvRepository cvRepository;
    public cvController(cvRepository cvRepository){
        this.cvRepository=cvRepository;
    }

    @GetMapping("/list")
    public List<cv> list(cv cv){
        return cvRepository.findAll();
    }

    @PostMapping("/add")
    public cv addCv(@RequestBody cv cv){
        cvGraudation cvGraudation=new cvGraudation();
        cvGraudation.nullCorrection(cv);
        return cvRepository.save(cv);
    }
}
