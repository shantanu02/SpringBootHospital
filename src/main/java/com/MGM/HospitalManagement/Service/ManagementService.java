package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.ManagementInformation;


public interface ManagementService {

	void addManagement(ManagementInformation managementInformation);

	ManagementInformation getManagementInformation(int management_id);

	List<ManagementInformation> getAllManagementInformation();

	void deleteManagementInformation(int management_id);
	
	void modifyManagementInformation(ManagementInformation managementInformation);
}
