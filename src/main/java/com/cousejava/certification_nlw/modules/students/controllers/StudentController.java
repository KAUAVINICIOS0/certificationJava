package com.cousejava.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cousejava.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.cousejava.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/students")

public class StudentController {

   
    
    //preciso usar meu USECASE
    @Autowired
    private  VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase; 
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        // Email
        // Technology
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result){
            return "User has already taken the test";
        }
        return "User can take the test";
    }




   

}