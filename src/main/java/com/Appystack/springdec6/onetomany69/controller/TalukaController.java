package com.Appystack.springdec6.onetomany69.controller;


import com.Appystack.springdec6.onetomany69.entity.Taluka;
import com.Appystack.springdec6.onetomany69.service.TalukaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalukaController {

    @Autowired
    private TalukaService talukaService;


    @PostMapping("saveTaluka")
    public String saveTaluka(@RequestBody Taluka taluka){
        return talukaService.saveTaluka(taluka);
    }
}
