package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.*;

public interface PatientService {
	void addPatientInformation(PatientInformation patientInformation);

	void addPatientTreatment(PatientTreatment patientTreatement);

	void addPatientExamination(PatientExamination patientExamination);

	void addPatientMedicines(PatientMedicines patientMedicines);

	void addPatientTest(PatientTest patientTest);

	PatientInformation getPatientInformation(int patientId);

	PatientExamination getPatientExamination(int peId);

	PatientTreatment getPatientTreatment(int ptId);

	PatientMedicines getPatientMedicines(int pmId);

	PatientTest getPatientTest(int pTestId);

	List<PatientInformation> getAllPatientInformation();

	List<PatientExamination> getAllPatientExamination();

	List<PatientTreatment> getAllPatientTreatment();

	List<PatientMedicines> getAllPatientMedicines();

	List<PatientTest> getAllPatientTest();

	void deletePatientInformation(int patientId);

	void deletePatientTreatment(int ptId);

	void deletePatientMedicines(int pmId);

	void deletePatientExamination(int peId);

	void deletePatientTest(int pTestId);

	void updatePatientInformation(PatientInformation patientInformation);

	void updatePatientTreatment(PatientTreatment patientTreatement);

	void updatePatientExamination(PatientExamination patientExamination);

	void updatePatientMedicines(PatientMedicines patientMedicines);

	void updatePatientTest(PatientTest patientTest);


}
