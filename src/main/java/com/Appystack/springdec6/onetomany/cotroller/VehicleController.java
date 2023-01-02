package com.Appystack.springdec6.onetomany.cotroller;

import com.Appystack.springdec6.onetomany.entity.Vehicle;
import com.Appystack.springdec6.onetomany.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @PostMapping("saveVehicle")
    public String saveVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
        return "Vehicle saved...";
    }

}
