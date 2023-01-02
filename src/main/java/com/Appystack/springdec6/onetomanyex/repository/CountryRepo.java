package com.Appystack.springdec6.onetomanyex.repository;

import com.Appystack.springdec6.onetomanyex.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Integer> {
}
