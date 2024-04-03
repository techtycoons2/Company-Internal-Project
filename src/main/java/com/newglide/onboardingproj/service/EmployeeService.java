package com.newglide.onboardingproj.service;

import com.newglide.onboardingproj.entity.Employee;

public interface EmployeeService {
	Employee empLogin(String email,String password);
}
