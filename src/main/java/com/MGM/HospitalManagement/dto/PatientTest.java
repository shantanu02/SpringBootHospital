package com.MGM.HospitalManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PatientTest")
public class PatientTest {

	@Id
    private int pTestId;
    private String pTestConsultant;
    private int pTestStatus;
	public int getpTestId() {
		return pTestId;
	}
	public void setpTestId(int pTestId) {
		this.pTestId = pTestId;
	}
	public String getpTestConsultant() {
		return pTestConsultant;
	}
	public void setpTestConsultant(String pTestConsultant) {
		this.pTestConsultant = pTestConsultant;
	}
	public int getpTestStatus() {
		return pTestStatus;
	}
	public void setpTestStatus(int pTestStatus) {
		this.pTestStatus = pTestStatus;
	}
	public PatientTest(int pTestId, String pTestConsultant, int pTestStatus) {
		super();
		this.pTestId = pTestId;
		this.pTestConsultant = pTestConsultant;
		this.pTestStatus = pTestStatus;
	}
	public PatientTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientTest [pTestId=" + pTestId + ", pTestConsultant=" + pTestConsultant + ", pTestStatus="
				+ pTestStatus + "]";
	}
    
    


}
