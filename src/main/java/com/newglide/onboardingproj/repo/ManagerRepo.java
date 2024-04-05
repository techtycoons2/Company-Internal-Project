package com.newglide.onboardingproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Manager;

public interface ManagerRepo extends JpaRepository<Employee, Integer> {
	Employee findByEmpEmailAndEmpPassword(String mgrEmail,String mgrPassword);
}
