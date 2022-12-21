package com.Appystack.springdec6.onetoone.repository;

import com.Appystack.springdec6.onetoone.entity.Aadhar;
import com.Appystack.springdec6.onetoone.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
