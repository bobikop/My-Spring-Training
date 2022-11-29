package com.cydeo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter  // Jakson is trying to convert response Wrapper to jsaon so we need getter and setter
@Setter
@NoArgsConstructor
public class ResponseWrapper {

    private boolean success;
    private String message;
    private Integer code;
    private Object data;
    // since we created ResponseWrapper class as a template and we put here Object field so
    // Object can be CourseDTO, UserDTo, AccountDTO or any DTO

    // if we want to use this class we can use it trough constructor

    // we will create two constructors so we can use this class to show our return


    public ResponseWrapper(String message, Object data){
        this.message = message;
        this.data = data;
        this.code = HttpStatus.OK.value();
        this.success = true;
    }

    // when use delete we will use second constructor without data since we will not have them after deletion
    public ResponseWrapper(String message){
        this.message = message;
        this.code=HttpStatus.OK.value();
        this.success=true;
    }
}
