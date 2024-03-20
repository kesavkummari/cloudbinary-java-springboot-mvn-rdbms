package com.demo.springHtmlCss.services;

import com.demo.springHtmlCss.Dtos.User;
import com.demo.springHtmlCss.repositorys.Reposy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicesss {


    @Autowired
    Reposy repo;


    public String insert(User user){


        repo.save(user);
        return  "";
    }

    public List<User> getAllData(){


        List<User> all=  repo.findAll();
        return all;
    }

    public  String dele(int id){
     Long i= (long) id;
        repo.deleteById(i);
     return "deleted";
    }

    public String checkUserNameAndPassword(User user) {
        List<User> allData = repo.findAll();
        StringBuilder response = new StringBuilder();

        boolean userFound = false;
        for (User us : allData) {
            if (us.getName().equals(user.getName())) {
                userFound = true;
                if (us.getPassWord().equals(user.getPassWord())) {
                    response.append("valid");
                } else {
                    response.append("invalid");
                }
                // No need to continue looping once a matching username is found
                break;
            }
        }

        if (!userFound) {
            // Handle the case where the provided username does not exist
            response.append("User not found");
        }

        return response.toString();
    }





}
