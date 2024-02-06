package com.cousejava.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cousejava.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/students")

public class StudentController {
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        // Email
        // Technology
        System.out.println(verifyHasCertificationDTO);
        return "User can take the test";
    }

}
