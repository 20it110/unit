package com.example.demo.conroller;

import com.example.demo.entities.PatientRecord;
import com.example.demo.repositories.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientRecordController {
    @Autowired
    PatientRecordRepository patientRecordRepository;

    @GetMapping("/patient")
    public List<PatientRecord> getAllPatients() {
        return patientRecordRepository.findAll();
    }

    @GetMapping("/patient/{patientId}")
    public PatientRecord getPatient(@PathVariable long id) {
        return patientRecordRepository.findById(id).get();
    }

    @DeleteMapping("/patient/{patientId}")
    public List<PatientRecord> deletePatient(@PathVariable long id) {
        patientRecordRepository.delete(patientRecordRepository.findById(id).get());
        return patientRecordRepository.findAll();
    }

    // Add new student
    @PostMapping("/patient")
    public List<PatientRecord> addPatient(@RequestBody PatientRecord patient) {
        patientRecordRepository.save(patient);
        return patientRecordRepository.findAll();
    }

    // Update the student information
    @PutMapping("/patient/{patientId}")
    public List<PatientRecord> updatePatient(@RequestBody PatientRecord patient, @PathVariable long id) {
        PatientRecord patientObj = patientRecordRepository.findById(id).get();
        patientObj.setName(patient.getName());
        patientObj.setAddress(patient.getAddress());
        patientRecordRepository.save(patientObj);
        return patientRecordRepository.findAll();
    }


}
