package com.Appystack.springdec6.onetomany69.service;

import com.Appystack.springdec6.onetomany69.entity.District;
import com.Appystack.springdec6.onetomany69.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DistrictImpl implements DistrictService{

    @Autowired
    private DistrictRepo districtRepo;

    @Override
    public String saveDistrict(District district) {
        districtRepo.save(district);
        return "distict saved..";
    }
}
