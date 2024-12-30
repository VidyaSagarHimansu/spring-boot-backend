package org.testspring.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name, address;
    private LocalDate dob;

    public Integer getId() {
        return id;
    }

    public Student() {
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Student(String name, String address, LocalDate dob) {
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

}
