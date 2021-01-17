package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientInformation;

public interface PatientInformationRepo extends JpaRepository<PatientInformation, Integer> {

}
