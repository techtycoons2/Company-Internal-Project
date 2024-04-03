package com.newglide.onboardingproj.repo;

import org.springframework.data.repository.CrudRepository;

import com.newglide.onboardingproj.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

	Employee findByEmpEmailAndEmpPassword(String empEmail,String empPassword);
}
