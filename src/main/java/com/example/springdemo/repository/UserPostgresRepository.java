package com.example.springdemo.repository;

import com.example.springdemo.model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

@ConditionalOnProperty(name = "spring-demo.db", havingValue = "postgres")
public interface UserPostgresRepository extends UserRepository {
    @Query("select u from User u where u.id=2")
    Optional<User> findFirstUser();
}