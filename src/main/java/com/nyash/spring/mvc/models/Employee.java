package com.nyash.spring.mvc.models;

import com.nyash.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.*;

public class Employee {

    @Size(min = 2, max = 20, message = "name must be minimum 2 symbols")
    @NotBlank(message = "name is required field")
    private String name;

    @Size(min = 2, max = 20, message = "surname must be minimum 2 symbols")
    @NotBlank(message = "surname is required field")
    private String surname;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    @Email
    @CheckEmail
    private String email;

    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1500, message = "must be less than 1501")
    private int salary;

    private String department;

    @NotEmpty(message = "please choose something")
    private String carBrands;

    @NotEmpty(message = "please choose something")
    private String[] languages;

    Map<String, String> departmentMap;

    Map<String, String> languagesMap;

    public Employee() {
        departmentMap = new HashMap<>();
        departmentMap.put("IT", "Information Technology");
        departmentMap.put("Sales", "Sales");
        departmentMap.put("HR", "Human Resources");

        languagesMap = new HashMap<>();
        languagesMap.put("EN", "EN");
        languagesMap.put("DE", "DE");
        languagesMap.put("FR", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(String carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getDepartmentMap() {
        return departmentMap;
    }

    public void setDepartmentMap(Map<String, String> departmentMap) {
        this.departmentMap = departmentMap;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", carBrands='" + carBrands + '\'' +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
