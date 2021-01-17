package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.Medicines;

public interface MedicinesRepo extends JpaRepository<Medicines, Integer> {

}
