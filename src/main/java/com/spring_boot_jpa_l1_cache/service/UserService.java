package com.spring_boot_jpa_l1_cache.service;

import com.spring_boot_jpa_l1_cache.entity.User;
import com.spring_boot_jpa_l1_cache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUser(Long primaryKey){
        return userRepository.findById(primaryKey).get();
    }
}
