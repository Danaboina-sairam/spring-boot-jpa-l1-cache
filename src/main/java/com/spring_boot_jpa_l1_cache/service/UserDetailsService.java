package com.spring_boot_jpa_l1_cache.service;

import com.spring_boot_jpa_l1_cache.entity.UserDetails;
import com.spring_boot_jpa_l1_cache.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public void saveUser(UserDetails userDetails){
        userDetailsRepository.save(userDetails);
    }

    public UserDetails getUser(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }
}
