package com.example.hrms.Bussiness;

import com.example.hrms.Entities.employer;

import java.util.regex.Pattern;

public class employerLogin implements loginRepository{
    private employer employer;
    public employerLogin(employer employer){
        this.employer=employer;
    }

    @Override
    public void systemControl(employer employer) {
    System.out.println("Onay verilmiştir");
    }
}
