package com.MGM.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.MGM.HospitalManagement.Repo.*;
import com.MGM.HospitalManagement.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImple implements PatientService {

	@Autowired
	PatientInformationRepo patientInformationRepo;
	@Autowired
	PatientExaminationRepo patientExaminationRepo;
	@Autowired
	PatientTreatmentRepo patientTreatmentRepo;
	@Autowired
	PatientMedicinesRepo patientMedicinesRepo;
	@Autowired
	PatientTestRepo patientTestRepo;

	@Override
	public void addPatientInformation(PatientInformation patientInformation) {
		patientInformationRepo.save(patientInformation);
		
	}

	@Override
	public void addPatientTreatment(PatientTreatment patientTreatement) {
		patientTreatmentRepo.save(patientTreatement);
	}

	@Override
	public void addPatientExamination(PatientExamination patientExamination) {
		patientExaminationRepo.save(patientExamination);
	}

	@Override
	public void addPatientMedicines(PatientMedicines patientMedicines) {
		patientMedicinesRepo.save(patientMedicines);
	}

	@Override
	public void addPatientTest(PatientTest patientTest) {
		patientTestRepo.save(patientTest);
	}

	@Override
	public PatientInformation getPatientInformation(int patientId) {
		Optional<PatientInformation> optional = patientInformationRepo.findById(patientId);
		return optional.get();
		
	}

	@Override
	public PatientExamination getPatientExamination(int peId) {
		Optional<PatientExamination> optional = patientExaminationRepo.findById(peId);
		return optional.get();
	}


	@Override
	public PatientTreatment getPatientTreatment(int ptId) {
		Optional<PatientTreatment> optional = patientTreatmentRepo.findById(ptId);
		return optional.get();
	}

	@Override
	public PatientMedicines getPatientMedicines(int pmId) {
		Optional<PatientMedicines> optional = patientMedicinesRepo.findById(pmId);
		return optional.get();
	}

	@Override
	public PatientTest getPatientTest(int pTestId) {
		Optional<PatientTest> optional = patientTestRepo.findById(pTestId);
		return optional.get();
	}

	@Override
	public List<PatientInformation> getAllPatientInformation() {
		Iterable<PatientInformation> iterable = patientInformationRepo.findAll();
		Iterator<PatientInformation> iterator = iterable.iterator();

		List<PatientInformation> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public List<PatientExamination> getAllPatientExamination() {
		Iterable<PatientExamination> iterable = patientExaminationRepo.findAll();
		Iterator<PatientExamination> iterator = iterable.iterator();

		List<PatientExamination> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public List<PatientTreatment> getAllPatientTreatment() {
		Iterable<PatientTreatment> iterable = patientTreatmentRepo.findAll();
		Iterator<PatientTreatment> iterator = iterable.iterator();

		List<PatientTreatment> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}


	@Override
	public List<PatientMedicines> getAllPatientMedicines() {
		Iterable<PatientMedicines> iterable = patientMedicinesRepo.findAll();
		Iterator<PatientMedicines> iterator = iterable.iterator();

		List<PatientMedicines> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public List<PatientTest> getAllPatientTest() {
		Iterable<PatientTest> iterable = patientTestRepo.findAll();
		Iterator<PatientTest> iterator = iterable.iterator();

		List<PatientTest> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public void deletePatientInformation(int patientId) {
		patientInformationRepo.deleteById(patientId);
	}

	@Override
	public void deletePatientTreatment(int ptId) {
		patientInformationRepo.deleteById(ptId);
	}

	@Override
	public void deletePatientMedicines(int pmId) {
		patientMedicinesRepo.deleteById(pmId);
	}

	@Override
	public void deletePatientExamination(int peId) {
		patientExaminationRepo.deleteById(peId);
	}

	@Override
	public void deletePatientTest(int pTestId) {
		patientTestRepo.deleteById(pTestId);
	}

	@Override
	public void updatePatientInformation(PatientInformation patientInformation) {
		patientInformationRepo.save(patientInformation);
		return ;
	}

	@Override
	public void updatePatientTreatment(PatientTreatment patientTreatement) {
		patientTreatmentRepo.save(patientTreatement);
		return;
	}


	@Override
	public void updatePatientExamination(PatientExamination patientExamination) {
		patientExaminationRepo.save(patientExamination);
		return ;
	}

	@Override
	public void updatePatientMedicines(PatientMedicines patientMedicines) {
		patientMedicinesRepo.save(patientMedicines);
		return ;
	}

	@Override
	public void updatePatientTest(PatientTest patientTest) {
		patientTestRepo.save(patientTest);
		return ;
	}

}
