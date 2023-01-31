package com.Appystack.springdec6.onetomany69.service;

import com.Appystack.springdec6.onetomany69.entity.Country1;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {

    String saveCountry(Country1 country);
}
