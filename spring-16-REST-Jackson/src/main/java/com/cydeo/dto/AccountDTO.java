package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"address", "country", "state"}, ignoreUnknown = true) // we can have ignore annotation here or on each code field
//  ignoreUnknown = true ... if we have anything which is not known from our application will ignore any extra field
@JsonIgnoreProperties(ignoreUnknown = true) // or we can use only this annotation ny itself
public class AccountDTO {

    @JsonIgnore
    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    @JsonBackReference // this field is not going to be serialized
    private UserDTO user;

}
