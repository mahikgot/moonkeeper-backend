package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
public class Joined {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long joined_id;
    private String joined_email;

    public Joined(String joined_email) {
        this.joined_email = joined_email;
    }
}
