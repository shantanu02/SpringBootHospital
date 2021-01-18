package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.Doctor;

public interface DoctorService {

	void addDoctor(Doctor doctor);

	Doctor getDoctor(int doctor_id);

	List<Doctor> getAllDoctor();

	void deleteDoctor(int doctor_id);
}
