package com.Appystack.springdec6.onetomany69.controller;


import com.Appystack.springdec6.onetomany69.entity.States;
import com.Appystack.springdec6.onetomany69.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatesController {


    @Autowired
    private StateService stateService;

    @PostMapping("saveStates")
    public String saveStates(@RequestBody States states){
        return stateService.saveState(states);
    }
}
