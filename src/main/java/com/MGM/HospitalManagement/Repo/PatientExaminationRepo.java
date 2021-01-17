package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientExamination;

public interface PatientExaminationRepo extends JpaRepository<PatientExamination, Integer> {

}
