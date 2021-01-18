package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.AdminInformation;

public interface AdminRepo extends JpaRepository<AdminInformation, Integer> {

}
