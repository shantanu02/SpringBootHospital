package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientTreatment;

public interface PatientTreatmentRepo extends JpaRepository<PatientTreatment, Integer> {

}
