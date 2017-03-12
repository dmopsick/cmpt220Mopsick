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
import com.ccd.parsers.XMLDOMParser;
import com.ccd.repositories.PatientRepository;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PatientServiceTests {
	private static final Logger logger = Logger.getLogger(PatientServiceTests.class);

    @Mock
    private PatientRepository patientRepository;
    
    @Mock
    private Patient patient;
    
    @Mock
    private ParserService parserService;
    
    // @InjectMocks
    private PatientService patientService;
    
    @Before
    public void setup() throws Exception {
        // MockitoAnnotations.initMocks(this);
        patientService = new PatientService(patientRepository, parserService, true);
    }
  
    
    /** Tests that the add method calls the save method in the patient repository */
    @Test
    public void addCallsPatientRepositorySave() throws Exception {
    	Patient samplePatient1 = new Patient(1L, "Joe", "Dirt", "ABC123DEF", "5555555555", "Provider", "DEF123ABC");
    	Patient samplePatient2 = new Patient(2L, "Bobby", "Johnson", "963JKL852", "7777777777", "Aetna", "WER456YTG");
    	Patient[] samplePatientArray = new Patient[1];
    	samplePatientArray[0] = samplePatient2;
    	
    	
    	ArgumentCaptor<Patient> patientCaptor = ArgumentCaptor.forClass(Patient.class);
    	List<Patient> capturedPatients;
    	
    	
    	Mockito.when(this.patientRepository.save(Mockito.isA(Patient.class))).thenReturn(samplePatient2);
    	Mockito.when(this.parserService.parsePatientFromFile("PatientList.xml")).thenReturn(samplePatientArray);
    	
    	patientService.add(samplePatient1);
    	
    	
    	Mockito.verify(this.patientRepository, Mockito.times(1)).save(patientCaptor.capture());
    	capturedPatients = patientCaptor.getAllValues();
    	Assert.assertEquals(capturedPatients.get(0).getId(), 1L);
        Assert.assertEquals(capturedPatients.get(0).getFullName(), "Joe Dirt");
        Assert.assertEquals(capturedPatients.get(0).getDiagnosis(), "ABC123DEF");
        Assert.assertEquals(capturedPatients.get(0).getPhoneNumber(), "5555555555");
        Assert.assertEquals(capturedPatients.get(0).getInsuranceProvider(), "Provider");
        Assert.assertEquals(capturedPatients.get(0).getInsuranceId(), "DEF123ABC");
    }
    
    /** Tests that the add method returns the intended patient */
    @Test
    public void addReturnsIntendedPatient() throws Exception {
        Patient samplePatient1 = new Patient(1L, "Joe", "Dirt", "ABC123DEF", "5555555555", "Provider", "DEF123ABC");
        Patient samplePatient2 = new Patient(2L, "Bobby", "Johnson", "963JKL852", "7777777777", "Aetna", "WER456YTG");
    	
    	Mockito.when(this.patientRepository.save(Mockito.isA(Patient.class))).thenReturn(samplePatient2);
    	
    	Patient returnedPatient = patientService.add(samplePatient1);
    	
    	
    	Mockito.verify(this.patientRepository, Mockito.times(1)).save(Mockito.isA(Patient.class));
    	Assert.assertEquals(returnedPatient.getId(), 2L);
        Assert.assertEquals(returnedPatient.getFullName(), "Bobby Johnson");
        Assert.assertEquals(returnedPatient.getDiagnosis(), "963JKL852");
        Assert.assertEquals(returnedPatient.getPhoneNumber(), "7777777777");
        Assert.assertEquals(returnedPatient.getInsuranceProvider(), "Aetna");
        Assert.assertEquals(returnedPatient.getInsuranceId(), "WER456YTG");
    }
    
}
