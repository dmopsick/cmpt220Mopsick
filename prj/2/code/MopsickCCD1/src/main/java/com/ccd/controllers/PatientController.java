package com.ccd.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccd.models.Patient;
import com.ccd.services.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	private PatientService patientService;
	private static final Logger logger = Logger.getLogger(PatientService.class);
	
	@Autowired
	public PatientController(PatientService patientService){
		this.patientService = patientService;
	}
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {}
	
	/** Allows the user to add a patients into the database via a file manually
	 * added into the root directory */
	@RequestMapping(method = RequestMethod.POST, value = "/{fileName}")
	ResponseEntity<Patient[]> addPatientFile(@PathVariable String fileName){
		// Add .xml to the fileName 
		String fileWithExtension = fileName += ".xml";
		
		// Initialize the HTTP status variable to be returned
		HttpStatus responseStatus;
		
		// Initialize the array that will be returned holding generated patients
		Patient[] addedPatients;
		
		// Add the patients from the passed file into the database 
		addedPatients = this.patientService.addPatientFromFile(fileWithExtension);
		if(addedPatients == null){
			responseStatus = HttpStatus.NOT_FOUND;
		}
		else{
			responseStatus = HttpStatus.CREATED;
		}
		return new ResponseEntity<Patient[]>(addedPatients, responseStatus);
	}
	
	/** Handles the request for a specific patient */
	@RequestMapping(method = RequestMethod.GET, value = "/{patientID}")
	ResponseEntity<Patient> readPatient(@PathVariable Long patientID){
		// logger.info("FLAG patient/1 called");
		// Initialize the HTTP status to be returned
		HttpStatus responseStatus;
		
		// Call the patient service to look for a patient with given ID in the repository
		Patient returnedPatient = this.patientService.read(patientID);
		
		if(returnedPatient == null){
			responseStatus = HttpStatus.NOT_FOUND;
		}
		else{
			responseStatus = HttpStatus.OK;
		}
		
		// Return the patient and the appropriate HTTP status
		return new ResponseEntity<Patient>(returnedPatient, responseStatus);
	}
	
	/** Handles the request for displaying all of the patients in the repository */
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<Patient>> readAllPatients(){
		// Initializes the HTTP status to be returned
		HttpStatus responseStatus;
		
		// Obtain the list of patients in the repository
		List<Patient> returnedPatientList = this.patientService.readAll();
		
		// logger.info("Flag" + returnedPatientList.get(0).getName());
		if(returnedPatientList == null){
			responseStatus = HttpStatus.NOT_FOUND;
			logger.info("FLAG - NOT FOUND");
		}
		else if(returnedPatientList.size() == 0){
			responseStatus = HttpStatus.NOT_FOUND;
			logger.info("FLAG - NOT FOUND");
		}
		else{
			responseStatus = HttpStatus.OK;
		}
		
		// Return the list of patients and the appropriate HTTP status
		return new ResponseEntity<List<Patient>>(returnedPatientList, responseStatus);
	}
}
