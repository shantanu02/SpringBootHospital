package com.MGM.HospitalManagement.Repo;

import com.MGM.HospitalManagement.dto.PatientMedicines;
import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.Medicines;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicinesRepo extends JpaRepository<Medicines, Integer> {



}
