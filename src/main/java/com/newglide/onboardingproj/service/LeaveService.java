package com.newglide.onboardingproj.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Leave;

import jakarta.validation.Valid;



public interface LeaveService {

	Employee LeaveApplication(Leave leave);

	Employee getLeaveApplicationById(Leave leave);

	List<Leave> getAllLeaveApplications();

	Leave applyForLeave( Leave leave);

	void cancelLeaveApplication(int id);
}
