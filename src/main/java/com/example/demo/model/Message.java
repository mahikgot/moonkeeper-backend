package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Getter @Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long message_id;

    @NotNull
    @NotEmpty
    private String message_name;

    @NotNull
    @NotEmpty
    private String message_email;

    @NotNull
    @NotEmpty
    private String message;

    @NotNull
    private OffsetDateTime message_timestamp;
}
