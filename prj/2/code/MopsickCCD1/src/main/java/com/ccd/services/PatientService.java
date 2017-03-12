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
    private final ParserService parserService;
    
    @Autowired
    public PatientService(PatientRepository patientRepository, ParserService parserService) {
        this.patientRepository = patientRepository;
        this.parserService = parserService;
        addPatientFromFile("PatientList1.xml");
    }
    
    public PatientService(PatientRepository patientRepository, ParserService parserService, Boolean live) {
        this.patientRepository = patientRepository;
        this.parserService = parserService;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {}

    /** Adds a list of patients into the repository from a XML file 
     * passed into the method via filename*/
    public void addPatientFromFile(String fileName) {
        // Save the returned list of patients parsed from XML
        Patient[] sampleList = this.parserService.parsePatientFromFile(fileName);

        // Save the parsed patients to the repository
        for (int i = 0; i < sampleList.length; i++) {
            add(sampleList[i]);
        }
    }

    /** Adds a patient into the repository */
    public Patient add(Patient bodyPatient) {
        Patient savedPatient = patientRepository.save(bodyPatient);
        //logger.info("Flag - saved patient's name " + savedPatient.getFullName());
        return savedPatient;
    }

    /** Returns a specific patient */
    public Patient read(Long patientId) {
        return this.patientRepository.findOne(patientId);
    }

    /** Returns all of the patients in the repository */
    public List<Patient> readAll() {
        logger.info("FLAG - readAll() was called");
        return this.patientRepository.findAll();
    }
}
