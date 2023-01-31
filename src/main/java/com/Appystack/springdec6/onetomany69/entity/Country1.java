package com.Appystack.springdec6.onetomany69.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Country1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name cannot be null")
    @Column(length = 100)
    private String countryName;

    @NotNull(message = "Code cannot be character")
    @Column(length = 100)
    private String countryCode;
}
