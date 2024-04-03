package com.newglide.onboardingproj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	@Column(nullable = false)
	private String adminName;
	private static String adminEmail = "admin@newglide.com";
	private static String adminPassword = "Admin@123";
}

	
