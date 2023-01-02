package com.Appystack.springdec6.manytomany.controller;

import com.Appystack.springdec6.manytomany.entity.Courses;
import com.Appystack.springdec6.manytomany.entity.Student1;
import com.Appystack.springdec6.manytomany.repository.CourseRepository;
import com.Appystack.springdec6.manytomany.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudController {

    @Autowired
    private StudRepository studRepository;

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("saveCourses")
    public String saveCourses(@RequestBody Courses courses){
        courseRepository.save(courses);
        return "courses saved..";
    }

    @PostMapping("saveStud")
    public String saveStud(@RequestBody Student1 student1){
        studRepository.save(student1);
        return "student saved..";
    }
}
