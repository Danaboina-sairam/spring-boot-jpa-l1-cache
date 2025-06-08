package com.spring_boot_jpa_l1_cache.service;

import com.spring_boot_jpa_l1_cache.entity.UserDetails;
import com.spring_boot_jpa_l1_cache.repository.UserDetailsRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsService {
    @Autowired
    EntityManagerFactory entityManagerFactory;
    public UserDetails saveUser(UserDetails userDetails){
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDetails);
        entityManager.find(UserDetails.class,1l);
        UserDetails output=entityManager.find(UserDetails.class,1l);
        System.out.println("I am able to find the data,name is:"+output.getName());
        entityManager.getTransaction().commit();
        entityManager.close();



        EntityManager entityManager2=entityManagerFactory.createEntityManager();
        entityManager2.getTransaction().begin();
        entityManager2.find(UserDetails.class,1l);
        UserDetails output2=entityManager2.find(UserDetails.class,1l);
        System.out.println("Session2:I am able to find the data,name is:"+output.getName());
        entityManager2.getTransaction().commit();
        entityManager2.close();
        return output2;
    }
}
