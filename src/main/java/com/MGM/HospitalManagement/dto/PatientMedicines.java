package com.MGM.HospitalManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PatientMedicines")
public class PatientMedicines {

	@Id
    private int pmId;
    private String pmDosage;
    private String pmTime;
	public int getPmId() {
		return pmId;
	}
	public void setPmId(int pmId) {
		this.pmId = pmId;
	}
	public String getPmDosage() {
		return pmDosage;
	}
	public void setPmDosage(String pmDosage) {
		this.pmDosage = pmDosage;
	}
	public String getPmTime() {
		return pmTime;
	}
	public void setPmTime(String pmTime) {
		this.pmTime = pmTime;
	}
	public PatientMedicines(int pmId, String pmDosage, String pmTime) {
		super();
		this.pmId = pmId;
		this.pmDosage = pmDosage;
		this.pmTime = pmTime;
	}
	public PatientMedicines() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientMedicines [pmId=" + pmId + ", pmDosage=" + pmDosage + ", pmTime=" + pmTime + "]";
	}
    
    

}
