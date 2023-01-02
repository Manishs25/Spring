package com.Appystack.springdec6.service.service;

import com.Appystack.springdec6.service.entity.College;
import com.Appystack.springdec6.service.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeImpl implements CollegeService{

    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public String saveCollege(College college){
        collegeRepository.save(college);
        return "college saved";
    }

}
