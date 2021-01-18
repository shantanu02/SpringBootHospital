package com.MGM.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MGM.HospitalManagement.Repo.DoctorRepo;
import com.MGM.HospitalManagement.dto.Doctor;
 


@Service
public class DoctorServiceImple  implements DoctorService{

	@Autowired
	DoctorRepo doctorRepo;
	
	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepo.save(doctor);
		
	}

	@Override
	public Doctor getDoctor(int doctor_id) {
		Optional<Doctor> optional = doctorRepo.findById(doctor_id);
		return optional.get();
	}

	@Override
	public List<Doctor> getAllDoctor() {
		Iterable<Doctor> iterable = doctorRepo.findAll();
		Iterator<Doctor> iterator = iterable.iterator();
		
		List<Doctor> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}
		
		return resultList;
	}

	@Override
	public void deleteDoctor(int doctor_id) {
		doctorRepo.deleteById(doctor_id);
		
	}

	@Override
	public void modifyDoctor(Doctor doctor) {
		 doctorRepo.save(doctor);
		
		
	}

}
