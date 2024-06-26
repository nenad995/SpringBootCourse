package com.nenad.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String programmingLanguage;
    private List<String> operatingSystem;

    public Student() {

    }

    public Student(String firstName, String lastName, String country, String programmingLanguage, List<String> operatingSystem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.programmingLanguage = programmingLanguage;
        this.operatingSystem = operatingSystem;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public List<String> getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(List<String> operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", operatingSystem=" + operatingSystem +
                '}';
    }
}
