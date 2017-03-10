package com.ccd.services;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ccd.models.Patient;
import com.ccd.repositories.PatientRepository;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PatientServiceTests {
	private static final Logger logger = Logger.getLogger(PatientServiceTests.class);

    @Mock
    private PatientRepository patientRepository;
    
    @Mock
    private Patient patient;
    
    // @InjectMocks
    private PatientService patientService;
    
    @Before
    public void setup() throws Exception {
        // MockitoAnnotations.initMocks(this);
        patientService = new PatientService(patientRepository);
    }
    
    /** Tests that the add method calls the save method in the patient repository */
    @Test
    public void addCallsPatientRepositorySave() throws Exception {
    	Patient samplePatient1 = new Patient(1L, "SampleName", "ABC123DEF", "5555555555", "Provider", "DEF123ABC");
    	Patient samplePatient2 = new Patient(2L, "Bobby", "ABC123DEF", "5555555555", "Provider", "DEF123ABC");
    	ArgumentCaptor<Patient> patientCaptor = ArgumentCaptor.forClass(Patient.class);
    	List<Patient> capturedPatients;
    	
    	Mockito.when(this.patientRepository.save(Mockito.isA(Patient.class))).thenReturn(samplePatient2);
    	
    	Patient patient = patientService.add(samplePatient1);
    	
    	
    	Mockito.verify(this.patientRepository, Mockito.times(1)).save(patientCaptor.capture());
    	capturedPatients = patientCaptor.getAllValues();
        Assert.assertEquals(capturedPatients.get(0).getName(), "SampleName");
        Assert.assertEquals(capturedPatients.get(0).getDiagnosis(), "ABC123DEF");
    }
    
    /** Tests that the add method returns the intended patient */
    @Test
    public void addReturnsIntendedPatient() throws Exception {
    	Patient samplePatient1 = new Patient(1L, "SampleName", "ABC123DEF", "5555555555", "Provider", "DEF123ABC");
    	Patient samplePatient2 = new Patient(2L, "Bobby", "ABC123DEF", "5555555555", "Provider", "DEF123ABC");
    	ArgumentCaptor<Patient> patientCaptor = ArgumentCaptor.forClass(Patient.class);
    	List<Patient> capturedPatients;
    	
    	Mockito.when(this.patientRepository.save(Mockito.isA(Patient.class))).thenReturn(samplePatient2);
    	
    	Patient patient = patientService.add(samplePatient1);
    	
    	
    	Mockito.verify(this.patientRepository, Mockito.times(1)).save(patientCaptor.capture());
    	capturedPatients = patientCaptor.getAllValues();
        Assert.assertEquals(capturedPatients.get(0).getName(), "SampleName");
        Assert.assertEquals(capturedPatients.get(0).getDiagnosis(), "ABC123DEF");
    }
    
}
