package com.Appystack.springdec6.jpa.repository;

import com.Appystack.springdec6.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Integer>{

}
