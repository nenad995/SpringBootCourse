package com.nenad.model;

import com.nenad.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    @NotNull(message = "required")
    @Size(min = 1, message = "required")
    private String firstName;

    @NotNull(message = "required")
    @Size(min = 1, message = "required")
    private String lastName;

    @NotNull(message = "required")
    @Min(value = 0, message = "Value must be greater than or equals to 0")
    @Max(value = 10, message = "Value must be less than or equals to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}$", message = "Value must be alphanumeric with length of 5 characters")
    private String zipCode;

    @CourseCode
    private String courseCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
