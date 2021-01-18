package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.ManagementInformation;

public interface ManagementInformationRepo extends JpaRepository<ManagementInformation, Integer>{

}
