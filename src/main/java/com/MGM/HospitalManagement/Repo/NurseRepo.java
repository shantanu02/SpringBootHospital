package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.Nurse;

public interface NurseRepo  extends JpaRepository<Nurse, Integer>{

}
