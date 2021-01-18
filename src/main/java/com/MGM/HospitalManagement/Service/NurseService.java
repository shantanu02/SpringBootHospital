package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.Nurse;

public interface NurseService {
	void addNurse(Nurse nurse);

	void getNurse(int nurse_id);

	List<Nurse> getAllNurse();

	void deleteNurse(int nurse_id);
}
