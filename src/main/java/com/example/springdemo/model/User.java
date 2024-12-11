package com.example.springdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "APP_USER")
public class User {

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

}