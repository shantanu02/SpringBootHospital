package com.MGM.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MGM.HospitalManagement.Repo.NurseRepo;
import com.MGM.HospitalManagement.dto.Doctor;
import com.MGM.HospitalManagement.dto.Nurse;


@Service
public class NurseServiceImple implements NurseService {

	@Autowired
	NurseRepo nurseRepo;
	
	
	@Override
	public void addNurse(Nurse nurse) {
		nurseRepo.save(nurse);
	}

	@Override
	public Nurse getNurse(int nurse_id) {
		Optional<Nurse> optional = nurseRepo.findById(nurse_id);
		return optional.get();
	
	}

	@Override
	public List<Nurse> getAllNurse() {
		Iterable<Nurse> iterable = nurseRepo.findAll();
		Iterator<Nurse> iterator = iterable.iterator();
		
		List<Nurse> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}
		
		return resultList;
	}

	@Override
	public void deleteNurse(int nurse_id) {
		nurseRepo.deleteById(nurse_id);
	}

	@Override
	public void modifyNurse(Nurse nurse) {
		nurseRepo.save(nurse);
		
	}

}
