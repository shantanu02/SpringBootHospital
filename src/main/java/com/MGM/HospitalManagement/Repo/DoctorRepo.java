package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

}
