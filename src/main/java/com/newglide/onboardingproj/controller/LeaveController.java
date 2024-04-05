package com.newglide.onboardingproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newglide.onboardingproj.entity.Employee;
import com.newglide.onboardingproj.entity.Leave;
import com.newglide.onboardingproj.service.LeaveService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("leave")
public class LeaveController {
    @Autowired
    private final LeaveService leaveService;

    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @GetMapping
    public List<Leave> getAllLeaveApplications() {
        return leaveService.getAllLeaveApplications();
    }

    @GetMapping("/{id}")
    public Employee getLeaveApplicationById(@PathVariable Leave leave) {
        return leaveService.getLeaveApplicationById(leave);
    }

    @PostMapping
    public ResponseEntity<Leave> applyForLeave(@Valid @RequestBody Leave leave) {
        Leave appliedLeave = leaveService.applyForLeave(leave);
        return new ResponseEntity<>(appliedLeave, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> cancelLeaveApplication(@PathVariable int id) {
        leaveService.cancelLeaveApplication(id);
        return ResponseEntity.ok().build();
    }
}