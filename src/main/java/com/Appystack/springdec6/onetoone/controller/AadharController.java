package com.Appystack.springdec6.onetoone.controller;

import com.Appystack.springdec6.onetoone.entity.Aadhar;
import com.Appystack.springdec6.onetoone.repository.AadharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AadharController {
    @Autowired
    private AadharRepository aadharRepository;

    @PostMapping("saveAadhar")
    public String saveAadhar(@RequestBody Aadhar aadhar) {
        aadharRepository.save(aadhar);
        return "Aadhar no. saved..";
    }
}
