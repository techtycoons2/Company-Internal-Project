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
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
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
	@OneToOne
	private Address address;
	@OneToOne
	private Leave leave;
	@ManyToOne
	private Manager manager;
	@OneToMany
	private List<Project> project;
	
	
}
