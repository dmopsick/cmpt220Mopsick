package com.ccd.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.ccd.models.Patient;
import com.ccd.services.PatientService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PatientControllerTests {
	private static final Logger logger = Logger.getLogger(PatientControllerTests.class);
	private MockMvc mockMvc;
    private MediaType jsonContent = new MediaType(MediaType.APPLICATION_JSON.getType(),
        MediaType.APPLICATION_JSON.getSubtype(),
                Charset.forName("utf8"));
    private ObjectMapper jsonMapper;

    @Mock
    private PatientService patientService;
    
    @InjectMocks
    private PatientController patientController;
    
    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);

        this.mockMvc = MockMvcBuilders.standaloneSetup(patientController).build();
        this.jsonMapper  = new ObjectMapper();
    }
    
    @Test
    public void getCallsPatientServiceRead() throws Exception {
    	Mockito.when(this.patientService.read(1L)).thenReturn(null);
        
    	MockHttpServletRequestBuilder getPatient  = get("/patient/1");
    	
    	mockMvc.perform(getPatient);
    	
    	Mockito.verify(this.patientService, Mockito.times(1)).read(1l);
    }
    
    @Test
    public void getReturnsIntendedPatient() throws Exception {
    	Patient samplePatient = new Patient(1L, "SampleName", "ABC123DEF", "5555555555", "Provider", "DEF123ABC");
    	
    	Mockito.when(this.patientService.read(1L)).thenReturn(samplePatient);
        
    	MockHttpServletRequestBuilder getPatient  = get("/patient/1");
        
        mockMvc.perform(getPatient)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.name", is("SampleName")))
                .andExpect(jsonPath("$.diagnosis", is("ABC123DEF")))
                .andExpect(jsonPath("$.phoneNumber", is("5555555555")))
                .andExpect(jsonPath("$.insuranceProvider", is("Provider")))
                .andExpect(jsonPath("$.insuranceId", is("DEF123ABC")));
    }
    
    @Test
    public void getHandlesBadPatientId() throws Exception {
    	Mockito.when(this.patientService.read(1L)).thenReturn(null);
        
    	MockHttpServletRequestBuilder getPatient  = get("/patient/1");
    	
        mockMvc.perform(getPatient)
                .andExpect(status().isNotFound());
    }
    
    @Test
    public void getAllCallsPatientServiceReadAll() throws Exception{
    	Mockito.when(this.patientService.readAll()).thenReturn(null);
    	
    	MockHttpServletRequestBuilder getPatient = get("/patient/");
    	
    	mockMvc.perform(getPatient)
    			.andExpect(status().isNotFound());
    	
    	Mockito.verify(this.patientService, Mockito.times(1)).readAll();
    }
    
    @Test
    public void getAllReturnsIntendedPatientList() throws Exception{
    	// Create sample patients to populate a sample patient list to ensure proper input is being returned
    	Patient samplePatient1 = new Patient(1L, "Bob", "ABC123DEF", "5555555555", "UnitedHealthcare", "DEF123ABC");
    	Patient samplePatient2 = new Patient(1L, "Janice", "QWE456RTY", "1234567890", "Aetna", "YUP845POK");
    	Patient samplePatient3 = new Patient(1L, "Franklin", "UIO789PAS", "9876543210", "Humana", "JOK852SNK");
    	List<Patient> samplePatientList = new ArrayList<Patient>();
    	samplePatientList.add(samplePatient1);
    	samplePatientList.add(samplePatient2);
    	samplePatientList.add(samplePatient3);
    	
    	Mockito.when(this.patientService.readAll()).thenReturn(samplePatientList);
    	
    	MockHttpServletRequestBuilder getPatient = get("/patient/");
    	
    	mockMvc.perform(getPatient)
    			.andExpect(status().isOk())
    			.andExpect(jsonPath("$[0].name", is("Bob")))
    			.andExpect(jsonPath("$[1].name", is("Janice")))
    			.andExpect(jsonPath("$[2].name", is("Franklin")));
    }
    
}
