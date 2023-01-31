package com.Appystack.springdec6.onetomany69.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Taluka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "name cannot be null")
    private String talukaName;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "district_name")
    private District district;
}
