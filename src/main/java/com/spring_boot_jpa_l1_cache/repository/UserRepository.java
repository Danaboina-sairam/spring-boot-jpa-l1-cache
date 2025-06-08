package com.spring_boot_jpa_l1_cache.repository;

import com.spring_boot_jpa_l1_cache.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
