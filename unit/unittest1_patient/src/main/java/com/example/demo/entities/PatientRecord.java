package com.example.demo.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientRecord {
 @Id
    private long  patientId;
    private String name;
    private String address;
    private Integer age;

    public PatientRecord(long patientId, String name, String address,Integer age){
        this.patientId = patientId;
        this.name = name;
        this.address = address;
        this.age=age;
    }
    public PatientRecord() {

    }
    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
