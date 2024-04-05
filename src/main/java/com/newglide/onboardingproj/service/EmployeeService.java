package com.newglide.onboardingproj.service;

import org.springframework.stereotype.Service;

import com.newglide.onboardingproj.entity.Employee;

@Service
public interface EmployeeService {
	Employee empLogin(String email,String password);
	Employee findById(int id);
	
	Employee empUpdate(Employee emp);
	Employee empLogout();
	Employee findByEmpEmailAndEmpPassword(String email,String password);
}
