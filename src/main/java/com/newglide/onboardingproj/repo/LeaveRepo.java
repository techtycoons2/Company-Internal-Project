package com.newglide.onboardingproj.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.newglide.onboardingproj.entity.Leave;

public interface LeaveRepo extends CrudRepository<Leave, Integer>{
	
	//List<Leave> findByEmployeeId(int employeeId);
}
