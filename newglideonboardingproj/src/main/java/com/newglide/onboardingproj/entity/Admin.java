package com.newglide.onboardingproj.entity;

import jakarta.persistence.Entity;


@Entity
public class Admin {
	private int adminId;
	private String adminName;
	private static String adminEmail = "admin@newglide.com";
	private static String adminPassword = "Admin@123";
}
