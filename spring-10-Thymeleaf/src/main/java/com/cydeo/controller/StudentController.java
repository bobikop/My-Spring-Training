package com.cydeo.controller;

import com.cydeo.bootstarp.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {


   // @RequestMapping(value = "/register", method = RequestMethod.GET) //localhost:8080/student/register
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

//    @RequestMapping("/welcome") //localhost:8080/student/welcome?id=3
//    public String drop(@RequestParam int id){
//
//        System.out.println(id);
//        return "student/welcome";
//
//    }

    @RequestMapping("/welcome") //localhost:8080/student/welcome?name=boban
    public String drop(@RequestParam String name){

        System.out.println(name);
        return "student/welcome";
    }
}