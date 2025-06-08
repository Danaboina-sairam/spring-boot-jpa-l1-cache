package com.spring_boot_jpa_l1_cache.controller;

import com.spring_boot_jpa_l1_cache.entity.UserDetails;
import com.spring_boot_jpa_l1_cache.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserDetailsController {
    @Autowired
    UserDetailsService userDetailsService;
    @GetMapping(path="/getUser")
    public UserDetails getUser(){
        UserDetails userDetails=new UserDetails("sairam","sairam8276@gmail.com");
        userDetailsService.saveUser(userDetails);
        UserDetails output1=userDetailsService.getUser(1l);
        return output1;
    }

    @GetMapping(path="/getUser2")
    public UserDetails getUser2(){
        UserDetails output1=userDetailsService.getUser(1l);
        return output1;
    }
}
