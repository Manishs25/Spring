package com.Appystack.springdec6.onetomany.repository;

import com.Appystack.springdec6.onetomany.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
