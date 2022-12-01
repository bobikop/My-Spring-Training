package com.cydeo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public class ResponseWrapper {

    //our custom class where we define how the json output will look (what fields to have)
    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    // constructor to show message and data after method is executed
    public ResponseWrapper(String message, Object data){
        this.message = message;
        this.data=data;
        this.code= HttpStatus.OK.value();
        this.success=true;
    }


    // constructor to show message only ( no data after delete) operation
    public ResponseWrapper(String message){
        this.message=message;
        this.code=HttpStatus.OK.value();
        this.success=true;
    }

}
