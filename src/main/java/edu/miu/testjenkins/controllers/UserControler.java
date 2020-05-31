package edu.miu.testjenkins.controllers;

import edu.miu.testjenkins.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserControler {

    @Autowired
    private UserServices userServices;

    @GetMapping("/user")
    public String getUserDetails(){
        return userServices.getUserName(102);
    }

}
