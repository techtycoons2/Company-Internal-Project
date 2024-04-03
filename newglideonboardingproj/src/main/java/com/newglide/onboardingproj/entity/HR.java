package com.newglide.onboardingproj.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class HR {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hrId;
	@Column(nullable = false)
	private String hrName;
	private static String hrEmail = "hr@newglide.com";
	@OneToMany(mappedBy = "hr", cascade = CascadeType.ALL)
	private List<Employee> employees;
}
