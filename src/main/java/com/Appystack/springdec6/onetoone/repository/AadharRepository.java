package com.Appystack.springdec6.onetoone.repository;

import com.Appystack.springdec6.onetoone.entity.Aadhar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

public interface AadharRepository extends JpaRepository<Aadhar, Integer> {

}
