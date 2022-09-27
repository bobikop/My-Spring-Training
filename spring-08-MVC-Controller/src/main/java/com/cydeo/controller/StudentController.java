package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student")
    public String getStudent(){
        return "student/home.html";// must give it exactly same location (student folder under the static)- static ic default looking folder
    }
}
