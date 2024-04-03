package com.newglide.onboardingproj.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newglide.onboardingproj.dao.EmployeeDao;
import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao empDao;
	
	@Override
	public Employee empLogin(String empEmail, String empPassword) {
		
		return empDao.empLogin(empEmail, empPassword);
	}

}
