package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.AdminInformation;

public interface AdminService {

	void addAdmin(AdminInformation adminInformation);

	AdminInformation getAdminInformation(int admin_id);

	List<AdminInformation> getAllAdminInformation();

	void deleteAdminInformation(int admin_id);
}
