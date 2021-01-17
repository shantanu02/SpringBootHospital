package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientTreatement;

public interface PatientTreatmentRepo extends JpaRepository<PatientTreatement, Integer> {

}
