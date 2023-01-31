package com.Appystack.springdec6.onetomany69.service;

import com.Appystack.springdec6.onetomany69.entity.Area;
import com.Appystack.springdec6.onetomany69.repository.AreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaImpl implements  AreaService{

    @Autowired
    private AreaRepo areaRepo;

    @Override
    public String saveArea(Area area) {
        areaRepo.save(area);
        return "pin saved..";
    }
}
