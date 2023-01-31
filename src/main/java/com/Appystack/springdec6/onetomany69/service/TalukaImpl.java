package com.Appystack.springdec6.onetomany69.service;


import com.Appystack.springdec6.onetomany69.entity.Taluka;
import com.Appystack.springdec6.onetomany69.repository.TalukaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalukaImpl implements TalukaService{

    @Autowired
    private TalukaRepo talukaRepo;


    @Override
    public String saveTaluka(Taluka taluka) {
        talukaRepo.save(taluka);
        return "taluka saved..";
    }
}
