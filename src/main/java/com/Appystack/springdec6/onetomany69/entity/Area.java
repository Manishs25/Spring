package com.Appystack.springdec6.onetomany69.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "pin cannot be null")
    @Column(length = 8)
    private String pinCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taluka_id")
    private Taluka taluka;

    }
