package com.skmonjurul.hibernate_inheritance_mapping.entity.table_per_class;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle{
    
    private Integer wheels;
    
    public Integer getWheels() {
        return wheels;
    }
    
    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
}
