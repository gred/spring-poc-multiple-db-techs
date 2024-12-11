package com.example.springdemo.repository;

import com.example.springdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstUser();
}
