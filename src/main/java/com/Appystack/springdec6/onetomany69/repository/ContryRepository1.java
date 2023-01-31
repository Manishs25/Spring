package com.Appystack.springdec6.onetomany69.repository;


import com.Appystack.springdec6.onetomany69.entity.Country1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContryRepository1 extends JpaRepository<Country1,Integer> {
}
