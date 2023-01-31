package com.Appystack.springdec6.onetomany69.service;

import com.Appystack.springdec6.onetomany69.entity.States;
import com.Appystack.springdec6.onetomany69.repository.StateRepos1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateImpl implements StateService {

    @Autowired
    private StateRepos1 stateRepos;


    @Override
    public String saveState(States states) {
        stateRepos.save(states);
        return "state saved..";
    }
}
