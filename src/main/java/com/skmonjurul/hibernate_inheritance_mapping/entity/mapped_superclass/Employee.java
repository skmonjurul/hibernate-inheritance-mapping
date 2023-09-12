package com.skmonjurul.hibernate_inheritance_mapping.entity.mapped_superclass;


import jakarta.persistence.Entity;

@Entity
public class Employee extends Person{
    private String company;
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
}
