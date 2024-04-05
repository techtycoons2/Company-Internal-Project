package com.newglide.onboardingproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Leave;
import com.newglide.onboardingproj.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@GetMapping("login")
	public ResponseEntity<Employee> empLogin(@RequestHeader String email, String password) {
		return new ResponseEntity<Employee>(es.empLogin(email, password),HttpStatus.ACCEPTED);
	}

	
//	@GetMapping("update")
//	public ResponseEntity<Employee> empUpdate(@RequestHeader Employee emp){
//		return new ResponseEntity<Employee>(HttpStatus.OK);
//		
//	}
//	@GetMapping("leave")
//	public ResponseEntity<Employee> leaveApp(@RequestBody Leave leave){
//		return new ResponseEntity<Employee>(es.leaveApp(leave),HttpStatus.CREATED);
//		
//	}
}