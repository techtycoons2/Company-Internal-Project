package com.newglide.onboardingproj.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;
	private LocalDate leaveStartDate;
	private LocalDate leaveEndDate;
	private String leaveReason;
	private int leavesTaken;
	private int leavesRemaining;
	private int leavesTotal;
}
