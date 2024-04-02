package com.newglide.onboardingproj.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Address {
	private String houseNumber;
	private String streetName;
	private String areaName;
	private String city;
	private String state;
	private String country;
	private int pincode;
}
