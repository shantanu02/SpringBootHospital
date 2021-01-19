package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MGM.HospitalManagement.dto.Nurse;

public interface NurseRepo  extends JpaRepository<Nurse, Integer>{
	
	@Query(value = "select * from nurse objNurse where objNurse.nurse_email=?1",nativeQuery = true)
	public Nurse getNurseByEmail(String nurse_email);
}
