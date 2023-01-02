package com.Appystack.springdec6.manytomany.repository;

import com.Appystack.springdec6.manytomany.entity.Student1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepository extends JpaRepository<Student1,Integer> {
}
