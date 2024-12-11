package com.example.springdemo.repository;

import com.example.springdemo.model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

@ConditionalOnProperty(name = "spring-demo.db", havingValue = "ora")
public interface UserOraRepository extends UserRepository {
    @Query("select u from User u where u.id=1")
    Optional<User> findFirstUser();
}
