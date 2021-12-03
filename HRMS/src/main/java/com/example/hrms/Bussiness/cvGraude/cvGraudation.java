package com.example.hrms.Bussiness.cvGraude;

import com.example.hrms.Entities.cv;

public class cvGraudation implements cvGradutionRepository{
    @Override
    public void nullCorrection(cv cv) {
        if (cv.getGraduationYear()== null){
            cv.setGraduationYear("Devam ediyor");
        }
    }
}
