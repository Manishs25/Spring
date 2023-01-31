package com.Appystack.springdec6.onetomany69.controller;


import com.Appystack.springdec6.onetomany69.entity.Area;
import com.Appystack.springdec6.onetomany69.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;


    @PostMapping("savePin")
    public String savePin(@RequestBody Area area){
        return areaService.saveArea(area);

    }
}
