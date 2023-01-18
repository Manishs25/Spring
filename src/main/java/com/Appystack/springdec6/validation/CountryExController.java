package com.Appystack.springdec6.validation;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryExController {
    @Autowired
    private CountryExRepository countryExRepository;

    @PostMapping("saveCtry")
    public String saveCtry(@RequestBody @Valid CountryEx countryEx){
        countryExRepository.save(countryEx);
        return "country saved";
    }
}
