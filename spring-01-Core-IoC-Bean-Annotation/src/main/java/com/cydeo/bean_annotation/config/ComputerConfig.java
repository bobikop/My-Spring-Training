package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {


    @Bean
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch beast", "Sony", 25);
    }
    @Bean
    public Case DellCase(){
        return new DellCase("220B", "Dell" , "240");
    }

    @Bean
    public Motherboard AsusMotherboard(){
       return new AsusMotherboard("Bj-200", "Asus", 4,6, "v2-44");
    }

    @Bean
    public Monitor monitorAcer(){
        return new AcerMonitor("23 inch Beast","Acer",23);
    }



}
