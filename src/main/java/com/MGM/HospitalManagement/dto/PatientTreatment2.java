package com.MGM.HospitalManagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PatientTreatment2")
public class PatientTreatment2 {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int pt2Id;
	private int medicineId;
	private String dosage;
	private String time;
	private int patientId;
	public int getPt2Id() {
		return pt2Id;
	}
	public void setPt2Id(int pt2Id) {
		this.pt2Id = pt2Id;
	}
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public PatientTreatment2(int pt2Id, int medicineId, String dosage, String time, int patientId) {
		super();
		this.pt2Id = pt2Id;
		this.medicineId = medicineId;
		this.dosage = dosage;
		this.time = time;
		this.patientId = patientId;
	}
	public PatientTreatment2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientTreatment2 [pt2Id=" + pt2Id + ", medicineId=" + medicineId + ", dosage=" + dosage + ", time="
				+ time + ", patientId=" + patientId + "]";
	}
	

}
