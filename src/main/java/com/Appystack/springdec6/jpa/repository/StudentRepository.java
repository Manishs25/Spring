package com.Appystack.springdec6.jpa.repository;

import com.Appystack.springdec6.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findDistinctByAddressAndName(String address, String name);

    @Query(value = "Select distinct address from student", nativeQuery = true)
    List<String> findDistinctAddress();

    List<Student> findByAddressOrName(String address, String name);

    List<Student> findByName(String name);

    List<Student> findByNameEquals(String name);


    List<Student> findByDobBetween(LocalDate startDate, LocalDate endDate);


    List<Student> findByDobLessThan(LocalDate date);

    List<Student> findByDobLessThanEqual(LocalDate date);

    List<Student> findByDobGreaterThan(LocalDate date);

    List<Student> findByDobGreaterThanEqual(LocalDate date);

    List<Student> findByDobAfter(LocalDate startDate);

    List<Student> findByDobBefore(LocalDate startDate);

    List<Student> findByNameNotNull();
}
