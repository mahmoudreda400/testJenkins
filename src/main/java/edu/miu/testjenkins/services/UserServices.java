package edu.miu.testjenkins.services;

import org.springframework.stereotype.Service;

@Service
public class UserServices {

    public String getUserName(long id){
        return "mahmoud";
    }
}
