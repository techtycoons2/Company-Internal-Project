package com.newglide.onboardingproj.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Leave;
import com.newglide.onboardingproj.repo.EmployeeRepo;

@Component
public class EmployeeDao {

	@Autowired
	EmployeeRepo er;
 
	public Employee empLogin(String empEmail, String empPassword) {
		return er.findByEmpEmailAndEmpPassword(empEmail, empPassword);
	}
	public Employee findById(int id) {
		return er.findById(id);
	}
//	
//	public Employee empUpdate(Employee emp) {
//		return er.empUpdate(emp);
//	
//	}
	
//	public Employee LeaveApplication(Leave leave) {
//		return er.LeaveApplication(leave);
//	}
}