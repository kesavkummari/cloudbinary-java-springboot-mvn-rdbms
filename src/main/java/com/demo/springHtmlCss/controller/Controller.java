package com.demo.springHtmlCss.controller;

import com.demo.springHtmlCss.Dtos.User;
import com.demo.springHtmlCss.dto.LoginForm;
import com.demo.springHtmlCss.services.Servicesss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class Controller {
@Autowired
    Servicesss serv;

    @PostMapping(value = "/register")
    public String login(@RequestBody LoginForm form) {
        // Process the login data
        // For simplicity, let's just print the values
        User user=new User();
        user.setName( form.getName());
        user.setDesignation(form.getDesigantion());
        user.setGender(form.getGender());
        user.setPassWord(form.getPassword());

        serv.insert(user);
        // Here you can perform authentication logic
        // For example, check credentials against a database
return  "valid";
        // Return a response (e.g., ResponseEntity)
    }



    @GetMapping(value = "/data")
    public List<User> allData(){

       return serv.getAllData();

    }


    @DeleteMapping(value = "/delete/{id}")
    public  String delete(@PathVariable  int id) {
        System.out.println(id+"LLLLLLLLLLLLLLLLLLLLLLL");
        serv.dele(id);
        return "deleted";
    }

    @PostMapping(value = "/check")
    public String check(@RequestBody User use) {
        System.out.println(use.getName() + "::" + use.getPassWord());
        String response = serv.checkUserNameAndPassword(use);
        return response;
    }



}
