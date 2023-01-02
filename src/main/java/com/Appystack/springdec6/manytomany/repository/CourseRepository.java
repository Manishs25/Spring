package com.Appystack.springdec6.manytomany.repository;

import com.Appystack.springdec6.manytomany.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Courses,Integer> {
}
