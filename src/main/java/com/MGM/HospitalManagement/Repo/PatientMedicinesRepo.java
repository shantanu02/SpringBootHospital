package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientMedicines;

public interface PatientMedicinesRepo extends JpaRepository<PatientMedicines, Integer>{

}
