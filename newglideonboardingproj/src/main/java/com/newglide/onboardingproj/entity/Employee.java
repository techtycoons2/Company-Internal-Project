package com.newglide.onboardingproj.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empImage;
	private String empEmail;
	private String empPassword;
	private long empPhone;
	private LocalDate empHiredate;
	@Column(nullable = true)
	private LocalDate empEndDate;
	private Address address;
	private Leave leave;
	@ManyToOne
	private Manager manager;
	@OneToMany
	private List<Project> project;
}
