package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.PatientInformation;

public interface PatientService {
	void addPatientInformation(PatientInformation patientInformation);

	void getPatientInformation(int patientId);

	List<PatientInformation> getAllPatientInformation();

	void deletePatientInformation(int patientId);
}
