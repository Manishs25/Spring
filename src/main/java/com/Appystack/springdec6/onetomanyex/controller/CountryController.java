package com.Appystack.springdec6.onetomanyex.controller;

import com.Appystack.springdec6.onetomanyex.entity.Country;
import com.Appystack.springdec6.onetomanyex.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @Autowired
    private CountryRepo countryRepo;

    @PostMapping("saveCountry")
    public String saveCountry(@RequestBody Country country){
        countryRepo.save(country);
        return "country saved...";
    }
}
