package com.newglide.onboardingproj.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Leave;
import com.newglide.onboardingproj.service.LeaveService;
@Service
public class LeaveServiceImpl implements LeaveService {

	
	Leave leave;
	@Override
	public Employee LeaveApplication(Leave leave) {
		// TODO Auto-generated method stub
		return leave.getEmployee();
	}

	@Override
	public Employee getLeaveApplicationById(Leave leave) {
		// TODO Auto-generated method stub
		return leave.getEmployee();
	}

	@Override
	public List<Leave> getAllLeaveApplications() {
		// TODO Auto-generated method stub
		return (List<Leave>) leave.getEmployee();
	}

	@Override
	public Leave applyForLeave(Leave leave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelLeaveApplication(int id) {
		// TODO Auto-generated method stub
		
	}

}
