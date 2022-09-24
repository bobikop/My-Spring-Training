package com.cydeo.streotype_annotation.casefactory;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;

    @Autowired
    private Dimensions dimensions;  // field injection is one way to do autowiring, we can do it trough contructor

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public abstract void pressPowerButton();

}
