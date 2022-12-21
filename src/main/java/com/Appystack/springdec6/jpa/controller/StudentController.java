package com.Appystack.springdec6.jpa.controller;

import com.Appystack.springdec6.jpa.entity.Student;
import com.Appystack.springdec6.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student) {
        Student student1 = new Student();
        student1.setDob(student.getDob());
        student1.setAddress(student.getAddress());
        student1.setMobileNumber(student.getMobileNumber());
        student1.setName(student.getName());
        Period period = Period.between(student.getDob(), LocalDate.now());
        int age = period.getYears();
        student1.setAge(age);
        studentRepository.save(student1);
        return "Student saved..";
    }
//
//
//    @PostMapping("saveStudents")
//    public String saveStudent(@RequestBody List<Student> students) {
//        studentRepository.saveAll(students);
//        return "Student saved..";
//    }
//
//    @GetMapping("getStudent")
//    public List<Student> getStudent() {
//        return studentRepository.findAll();
//    }
//
//    @GetMapping("getById/{id}")
//    public Optional<Student> getStudentById(@PathVariable Integer id) {
//        return studentRepository.findById(id);
//    }
//
//
//    @GetMapping("getById/{id}")
//    public Student getByStudentId(@PathVariable Integer id) {
//        return studentRepository.getReferenceById(id);
//    }
//
//
//    @PutMapping("update")
//    public String updateStudent(@RequestBody Student student) {
//        Student student1 = studentRepository.getReferenceById(student.getId());
//        student1.setAddress(student.getAddress());
//        student1.setName(student.getName());
//        student1.setMobileNumber(student.getMobileNumber());
//
//        studentRepository.save(student1);
//        return "record Updated";
//    }
//
//    @DeleteMapping("delete/{id}")
//    public String deleteStudent(@PathVariable("id") Integer id) {
//        studentRepository.deleteById(id);
//        return "record deleted..";
//    }
//
//    @DeleteMapping("deleteByIds/{id}")
//    public String deleteStudents(@PathVariable("id") List<Integer> id) {
//        studentRepository.deleteAllById(id);
//        return "records deleted..";
//    }
//
//    @PostMapping("deleteByObject/{id}")
//    public String deleteStudent(@RequestBody Student student) {
//        studentRepository.delete(student);
//        return "records deleted...";
//    }
//
//    @GetMapping("getByAddress/{address}/{name}")
//    public List<Student> getByAddress(@PathVariable("address")String address,@PathVariable("name") String name){
//        return studentRepository.findDistinctByAddressAndName(address, name);
//    }
//
//    @GetMapping("getByAddress/{address}/{name}")
//    public List<Student> getByAddress(@PathVariable("address")String address,@PathVariable("name") String name){
//        return studentRepository.findByAddressOrName(address, name);
//    }
//
//    @GetMapping("getByName/{name}")
//    public List<Student> getByName(@PathVariable("name") String name){
//        return studentRepository.findByName(name);
//    }
//
//    @GetMapping("getByName/{name}")
//    public List<Student> getByName(@PathVariable("name") String name){
//        return studentRepository.findByNameEquals(name);
//    }
//
//    @GetMapping("getByDobBetween/{startDate}/{endDate}")
//    public List<Student> getByDobBetween(@PathVariable("startDate") LocalDate startDate, @PathVariable("endDate") LocalDate endDate) {
//        return studentRepository.findByDobBetween(startDate, endDate);
//    }

    @GetMapping("getByLessThanAge/{date}")
    public List<Student> getByDobLess(@PathVariable("date") LocalDate date) {
        return studentRepository.findByDobLessThan(date);
    }

    @GetMapping("getByYear/{date}")
    public List<Student> getByYear(@PathVariable("date") LocalDate date) {
        return studentRepository.findByDobLessThanEqual(date);
    }

    @GetMapping("getByGreaterAge/{date}")
    public List<Student> getByGreaterAge(@PathVariable("date") LocalDate date) {
        return studentRepository.findByDobGreaterThan(date);
    }

    @GetMapping("getByGreaterThanAge/{date}")
    public List<Student> getByGreaterThanAge(@PathVariable("date") LocalDate date) {
        return studentRepository.findByDobGreaterThanEqual(date);
    }

    @GetMapping("getByAfter/{startDate}")
    public List<Student> getByAfter(@PathVariable("startDate") LocalDate startDate) {
        return studentRepository.findByDobAfter(startDate);
    }

    @GetMapping("getByBefore/{startDate}")
    public List<Student> getByBefore(@PathVariable("startDate") LocalDate startDate) {
        return studentRepository.findByDobBefore(startDate);
    }

    @GetMapping("getByNullName")
    public List<Student> getNullName(){
        return studentRepository.findByNameNotNull();
    }

}





