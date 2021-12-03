package com.example.hrms.Bussiness;


import com.example.hrms.Entities.jobSeekers;
import com.example.hrms.Mernis.DVBKPSPublicSoap;
import lombok.RequiredArgsConstructor;

import java.util.regex.Pattern;

@RequiredArgsConstructor//zorunlu autowired
public class jobSekeersLogin implements jobSekeersLoginRepository {


    @Override
    public void mernis(jobSeekers jobSekeers) throws Exception {
        DVBKPSPublicSoap kpsPublic = new DVBKPSPublicSoap();
        boolean result = kpsPublic.TCKimlikNoDogrula(
                Long.parseLong(jobSeekers.getTcNo()),
                jobSeekers.getName(),
                jobSeekers.getSurname(),
                jobSeekers.getBirthDay());
        System.out.println(result?"Tc bilgileriniz doğru":"Bilgileriniz yanlış lütfen yeterli bilgileri giriniz");
    }
}
