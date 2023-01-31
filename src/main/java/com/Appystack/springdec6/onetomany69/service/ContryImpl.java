package com.Appystack.springdec6.onetomany69.service;

import com.Appystack.springdec6.onetomany69.entity.Country1;
import com.Appystack.springdec6.onetomany69.repository.ContryRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContryImpl implements CountryService{

    @Autowired
    private ContryRepository1 contryRepository;

    @Override
    public String saveCountry(Country1 country) {
        contryRepository.save(country);
        return "country saved..";
    }
}
