package com.Appystack.springdec6.validation;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CountryEx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name cannot be null")
    @Column(length = 100)
    private String countryName;

    @NotNull(message = "Country code cannot be null")
    private String countryCode;

    @Email(message = "invalid format")
    private String email;

    @Max(value = 21432503825L)
    @Min(value = 1000)
    private Long population;

    @NotNull(message = "ISD code cannot be null")
    @Column(length = 3)
    private String isdCode;



}
