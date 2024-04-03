package com.newglide.onboardingproj.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
	private String empImage;
	@Column(nullable = false)
	private String empEmail;
	@Column(nullable = false)
	private String empPassword;
	@Column(nullable = false,unique = true)
	@Min(10)
	@Max(10)
	private long empPhone;
	@Column(nullable = false)
	private LocalDate empHiredate;
	@Column(nullable = true)
	private LocalDate empEndDate;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "addrId")
	private Address address;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Leave> leaves;
	@ManyToOne
    @JoinColumn(name = "managerId")
	private Manager manager;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Project> project;
	@ManyToOne
    @JoinColumn(name = "hr_id")
	private HR hr;
	
}
