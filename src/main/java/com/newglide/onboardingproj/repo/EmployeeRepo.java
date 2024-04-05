package com.newglide.onboardingproj.repo;

import org.springframework.data.repository.CrudRepository;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Leave;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

	Employee findByEmpEmailAndEmpPassword(String empEmail,String empPassword);
	Employee findById(int id);
//	Employee empUpdate(Employee emp);
	//Employee LeaveApplication(Leave leave);
}
