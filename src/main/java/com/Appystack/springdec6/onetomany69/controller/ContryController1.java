package com.Appystack.springdec6.onetomany69.controller;

import com.Appystack.springdec6.onetomany69.entity.Country1;
import com.Appystack.springdec6.onetomany69.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContryController1 {

    @Autowired
    private CountryService countryService;

        @PostMapping("saveCtry")
        public String saveCtry(@RequestBody Country1 country){
            return countryService.saveCountry(country);
        }
}
