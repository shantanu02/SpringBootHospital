package com.MGM.HospitalManagement.Repo;

import com.MGM.HospitalManagement.dto.PatientExamination;
import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientTreatment;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientTreatmentRepo extends JpaRepository<PatientTreatment, Integer> {

    @Query(value="select * from patient_treatment where pe_id = ?1",nativeQuery=true)
    public List<PatientTreatment> getPatientTreatmentByPeId(int peId);

}
