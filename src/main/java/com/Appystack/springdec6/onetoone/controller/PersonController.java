package com.Appystack.springdec6.onetoone.controller;

import com.Appystack.springdec6.onetoone.entity.Aadhar;
import com.Appystack.springdec6.onetoone.entity.Person;
import com.Appystack.springdec6.onetoone.repository.AadharRepository;
import com.Appystack.springdec6.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AadharRepository aadharRepository;

    @PostMapping("savePerson")
    public String savePerson(@RequestBody Person person){
        Person person1 =  new Person();
        person1.setAge(10);
        person1.setName("MRS");


        Aadhar aadhar = new Aadhar();
        aadhar.setAadharNumber(23424325L);
        aadhar.setNationality("Indian");

        person1.setAadhar(aadhar);
        aadhar.setPerson(person1);

        personRepository.save(person1);
        aadharRepository.save(aadhar);
        return "person and aadhar saved...";
    }
}
