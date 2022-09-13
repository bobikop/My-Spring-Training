package com.cydeo.streotype_annotation.casefactory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@AllArgsConstructor
@Component
public class Dimensions {

    private int width;

    private int height;

    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = 120;
        this.height = 360;
        this.depth = 50;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
