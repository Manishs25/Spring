package com.Appystack.springdec6.onetomany69.controller;


import com.Appystack.springdec6.onetomany69.entity.District;
import com.Appystack.springdec6.onetomany69.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @PostMapping("saveDist")
    public  String saveDist(@RequestBody District district){
        districtService.saveDistrict(district);
        return "District saved..";
    }
}
