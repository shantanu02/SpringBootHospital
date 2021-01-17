package com.MGM.HospitalManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {

	@Id
    private int doctorId;
    private String doctorFName;
    private String doctorLName;
    private String doctorEmail;
    private String doctorPassword;
    private String doctorPhone;
    private String doctorAddresss;
    private String doctorCity;
    private String doctorZipCode;
    private String doctorState;
    private String doctorGender;
    private String doctorDOB;
    private String doctorQualification;
    private String doctorSpecialization;
    private double doctorExperience;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorFName() {
		return doctorFName;
	}
	public void setDoctorFName(String doctorFName) {
		this.doctorFName = doctorFName;
	}
	public String getDoctorLName() {
		return doctorLName;
	}
	public void setDoctorLName(String doctorLName) {
		this.doctorLName = doctorLName;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDoctorPassword() {
		return doctorPassword;
	}
	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}
	public String getDoctorPhone() {
		return doctorPhone;
	}
	public void setDoctorPhone(String doctorPhone) {
		this.doctorPhone = doctorPhone;
	}
	public String getDoctorAddresss() {
		return doctorAddresss;
	}
	public void setDoctorAddresss(String doctorAddresss) {
		this.doctorAddresss = doctorAddresss;
	}
	public String getDoctorCity() {
		return doctorCity;
	}
	public void setDoctorCity(String doctorCity) {
		this.doctorCity = doctorCity;
	}
	public String getDoctorZipCode() {
		return doctorZipCode;
	}
	public void setDoctorZipCode(String doctorZipCode) {
		this.doctorZipCode = doctorZipCode;
	}
	public String getDoctorState() {
		return doctorState;
	}
	public void setDoctorState(String doctorState) {
		this.doctorState = doctorState;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorDOB() {
		return doctorDOB;
	}
	public void setDoctorDOB(String doctorDOB) {
		this.doctorDOB = doctorDOB;
	}
	public String getDoctorQualification() {
		return doctorQualification;
	}
	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public double getDoctorExperience() {
		return doctorExperience;
	}
	public void setDoctorExperience(double doctorExperience) {
		this.doctorExperience = doctorExperience;
	}
	public Doctor(int doctorId, String doctorFName, String doctorLName, String doctorEmail, String doctorPassword,
			String doctorPhone, String doctorAddresss, String doctorCity, String doctorZipCode, String doctorState,
			String doctorGender, String doctorDOB, String doctorQualification, String doctorSpecialization,
			double doctorExperience) {
		super();
		this.doctorId = doctorId;
		this.doctorFName = doctorFName;
		this.doctorLName = doctorLName;
		this.doctorEmail = doctorEmail;
		this.doctorPassword = doctorPassword;
		this.doctorPhone = doctorPhone;
		this.doctorAddresss = doctorAddresss;
		this.doctorCity = doctorCity;
		this.doctorZipCode = doctorZipCode;
		this.doctorState = doctorState;
		this.doctorGender = doctorGender;
		this.doctorDOB = doctorDOB;
		this.doctorQualification = doctorQualification;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorExperience = doctorExperience;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorFName=" + doctorFName + ", doctorLName=" + doctorLName
				+ ", doctorEmail=" + doctorEmail + ", doctorPassword=" + doctorPassword + ", doctorPhone=" + doctorPhone
				+ ", doctorAddresss=" + doctorAddresss + ", doctorCity=" + doctorCity + ", doctorZipCode="
				+ doctorZipCode + ", doctorState=" + doctorState + ", doctorGender=" + doctorGender + ", doctorDOB="
				+ doctorDOB + ", doctorQualification=" + doctorQualification + ", doctorSpecialization="
				+ doctorSpecialization + ", doctorExperience=" + doctorExperience + "]";
	}

    

}
