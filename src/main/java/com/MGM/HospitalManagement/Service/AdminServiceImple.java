package com.MGM.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.MGM.HospitalManagement.Repo.AdminRepo;
import com.MGM.HospitalManagement.dto.AdminInformation;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImple implements AdminService {

	@Autowired
	AdminRepo adminRepo;

	@Override
	public void addAdmin(AdminInformation adminInformation) {
		adminRepo.save(adminInformation);

	}

	@Override
	public AdminInformation getAdminInformation(int admin_id) {
		Optional<AdminInformation> optional = adminRepo.findById(admin_id);
		return optional.get();

	}

	@Override
	public void deleteAdminInformation(int admin_id) {
		adminRepo.deleteById(admin_id);
	}

	@Override
	public List<AdminInformation> getAllAdminInformation() {
		Iterable<AdminInformation> iterable = adminRepo.findAll();
		Iterator<AdminInformation> iterator = iterable.iterator();

		List<AdminInformation> resultList = new ArrayList<>();
		while (iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

}
