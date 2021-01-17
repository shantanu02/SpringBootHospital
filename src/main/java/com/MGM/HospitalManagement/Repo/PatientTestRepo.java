package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientTest;

public interface PatientTestRepo extends JpaRepository<PatientTest, Integer> {

}
