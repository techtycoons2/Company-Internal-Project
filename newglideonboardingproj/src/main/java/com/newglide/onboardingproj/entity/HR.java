package com.newglide.onboardingproj.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class HR {
	@Id
	private int hrId;
	private String hrName;
	private static String hrEmail = "hr@newglide.com";
	@OneToMany
	private List<Employee> employees;
}
