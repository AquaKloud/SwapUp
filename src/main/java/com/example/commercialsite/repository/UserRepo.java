package com.example.commercialsite.repository;

import com.example.commercialsite.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User,Integer> {
    boolean existsByUserGmailEquals(String userGmail);
}