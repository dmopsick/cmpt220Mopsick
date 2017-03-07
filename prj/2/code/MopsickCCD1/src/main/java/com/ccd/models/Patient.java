package com.ccd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String diagnosis;
	private String phoneNumber;
	private String insuranceProvider;
	private String insuranceId;
	
	private Patient(){};
	
	public Patient(long id, String name, String diagnosis, String phoneNumber, String insuranceProvider, String insuranceId){
		this.id = id;
		this.name = name;
		this.diagnosis = diagnosis;
		this.phoneNumber = phoneNumber;
		this.insuranceProvider = insuranceProvider;
		this.insuranceId = insuranceId;
	}
	
	// Getter and setter methods to access and modify variables
	public long getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getDiagnosis(){
		return diagnosis;
	}
	
	public String getInsuranceProvider(){
		return insuranceProvider;
	}
	
	public String getInsuranceId(){
		return insuranceId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public void setDiagnosis(String diagnosis){
		this.diagnosis = diagnosis;
	}
	
	public void setInsuranceProvider(String insuranceProvider){
		this.insuranceProvider = insuranceProvider;
	}
	
	public void setInsuranceId(String insuranceId){
		this.insuranceId = insuranceId;
	}
}