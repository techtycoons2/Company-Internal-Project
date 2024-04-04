package com.newglide.onboardingproj.entity;

import java.sql.Blob;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Column(nullable = false)
	private String empName;
	private Blob empImage;
	@Column(nullable = false)
	private String empEmail;
	@Column(nullable = false)
	private String empPassword;
	@Column(nullable = false,unique = true)
	private long empPhone;
	@Column(nullable = false)
	@JsonFormat(pattern ="yyyy-MM-dd")
	private LocalDate empHiredate;
	@JsonFormat(pattern ="yyyy-MM-dd")
	private LocalDate empEndDate;
	private int age;
	private String gender;
	private String empDesignation;
	private double empSalary;
	private boolean mgrStatus;
	private int mgr_id;
	private boolean hrStatus;
	private int hr_id;
	@OneToOne(mappedBy = "employee")
	private Address address;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Leave> leaves;	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Project> projects;
}
