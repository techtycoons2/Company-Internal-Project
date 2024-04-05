package com.newglide.onboardingproj.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Manager;
import com.newglide.onboardingproj.repo.EmployeeRepo;
import com.newglide.onboardingproj.repo.ManagerRepo;

@Component
public class ManagerDao {
	
//	@Autowired
//	ManagerRepo mr;
	
	
	@Autowired
	EmployeeRepo er;
	
	
    
	public Employee mgrLogin(String empEmail, String empPassword) {
		return er.findByEmpEmailAndEmpPassword(empEmail, empPassword);
	}
}
