package com.Appystack.springdec6.onetomany69.repository;

import com.Appystack.springdec6.onetomany69.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<District,Integer> {

}
