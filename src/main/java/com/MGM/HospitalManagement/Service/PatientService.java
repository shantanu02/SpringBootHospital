package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.*;

public interface PatientService {

	int addPatientInformation(PatientInformation patientInformation);

	int addPatientTreatment(PatientTreatment patientTreatement);

	int addPatientExamination(PatientExamination patientExamination);

	int addPatientMedicines(PatientMedicines patientMedicines);

	int addPatientTest(PatientTest patientTest);

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

	int deletePatientInformation(int patientId);

	int deletePatientTreatment(int ptId);

	int deletePatientMedicines(int pmId);

	int deletePatientExamination(int peId);

	int deletePatientTest(int pTestId);

	int updatePatientInformation(PatientInformation patientInformation);

	int updatePatientTreatment(PatientTreatment patientTreatement);

	int updatePatientExamination(PatientExamination patientExamination);

	int updatePatientMedicines(PatientMedicines patientMedicines);

	int updatePatientTest(PatientTest patientTest);

	List<PatientExamination> getAllPatientExaminationByPatientId(int patientId);

	List<PatientInformation> getAllPatientInformationByNurseId(int nurseId);

	List<PatientInformation> getAllPatientInformationByDoctorId(int doctorId);

	List<PatientTreatment> getAllPatientTreatmentByPeId(int peId);

	List<PatientMedicines> getAllPatientMedicinesByPtId(int ptId);

	List<PatientTest> getAllPatientTestByPtId(int ptId);

}
