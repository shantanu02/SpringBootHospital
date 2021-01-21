package com.MGM.HospitalManagement.Repo;

import com.MGM.HospitalManagement.dto.PatientExamination;
import com.MGM.HospitalManagement.dto.PatientMedicines;
import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.Medicines;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicinesRepo extends JpaRepository<Medicines, Integer> {

    @Query(value="select distinct medicine_type from medicines",nativeQuery=true)
    public List<String> getMedicinesType();

    @Query(value="select * from medicines where medicine_type = ?1",nativeQuery=true)
    public List<Medicines> getMedicinesByType(String medicineType);

}
