package com.MGM.HospitalManagement.Service;

import com.MGM.HospitalManagement.Repo.MedicinesRepo;
import com.MGM.HospitalManagement.dto.Medicines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MecdicinesServiceImple implements MedicinesService {
    @Autowired
    MedicinesRepo medicinesRepo;

    @Override
    public List<String> getMedicineType() {
        return medicinesRepo.getMedicinesType();
    }

    @Override
    public List<Medicines> getMedicinesType(String medicineType) {
        return medicinesRepo.getMedicinesByType(medicineType);
    }
}
