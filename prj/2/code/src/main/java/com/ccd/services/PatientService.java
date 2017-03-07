package com.ccd.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.ccd.models.Patient;
import com.ccd.parsers.XMLDOMParser;
import com.ccd.repositories.PatientRepository;

@Service
public class PatientService {
	 private static final Logger logger = Logger.getLogger(PatientService.class);
		private final PatientRepository patientRepository;
		
		@Autowired
		public PatientService(PatientRepository patientRepository){
			this.patientRepository = patientRepository;
			addSamplePatientList("PatientList1.xml");
		}
		
		@InitBinder
		protected void initBinder(WebDataBinder binder){}
		
		/** Adds sample patients into the repository */
		public void addSamplePatientList(String fileName){
			// Parse the sample XML file
			XMLDOMParser parser = new XMLDOMParser();
			Patient[] sampleList = parser.parsePatientXML(fileName);
			
			// Save the parsed patients to the repository
			for(int i = 0; i < sampleList.length; i ++){
				add(sampleList[i]);
			}
		}
		
		/** Adds a patient into the repository */
		public Patient add(Patient bodyPatient){
			Patient savedPatient = this.patientRepository.save(bodyPatient);
			return savedPatient;
		}
		
		/** Returns a specific patient */
		public Patient read(Long patientId){
			return this.patientRepository.findOne(patientId)
;		}
		
		/** Returns all of the patients in the repository */
		public List<Patient> readAll(){
			logger.info("FLAG - readAll() was called");
			return this.patientRepository.findAll();
		}
}	
