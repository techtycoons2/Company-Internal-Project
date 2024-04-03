package com.newglide.onboardingproj.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "employee_leave")
public class Leave {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leaveId;
    @Column(nullable = false)
    private LocalDate leaveStartDate;
    @Column(nullable = false)
    private LocalDate leaveEndDate;
    @Column(nullable = false)
    private String leaveReason;
	private int leavesTaken;
	private int leavesRemaining;
	private static int leavesTotal=21;
    @ManyToOne
    @JoinColumn(name = "emp_Id")
    private Employee employee;

}
