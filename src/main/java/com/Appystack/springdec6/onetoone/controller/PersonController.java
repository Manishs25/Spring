package com.Appystack.springdec6.onetoone.controller;

import com.Appystack.springdec6.onetoone.entity.Person;
import com.Appystack.springdec6.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("savePerson")
    public String savePerson(@RequestBody Person person) {
        personRepository.save(person);
        return "person saved..";
    }

}
