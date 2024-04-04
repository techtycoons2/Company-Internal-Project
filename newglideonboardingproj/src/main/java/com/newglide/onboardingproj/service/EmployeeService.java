package com.newglide.onboardingproj.service;

import com.newglide.onboardingproj.entity.Employee;

public interface EmployeeService {
	Employee empSave(Employee e);
	Employee empLogin(String email,String password);
}
