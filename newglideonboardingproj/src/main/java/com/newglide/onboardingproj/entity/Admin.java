package com.newglide.onboardingproj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Admin {
	@Id
	private int adminId;
	private String adminName;
	private static String adminEmail = "admin@newglide.com";
	private static String adminPassword = "Admin@123";
}
