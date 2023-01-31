package com.Appystack.springdec6.onetomany69.repository;

import com.Appystack.springdec6.onetomany69.entity.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepos1 extends JpaRepository<States, Integer> {
}
