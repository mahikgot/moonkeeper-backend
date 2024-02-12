package com.example.demo.dto;

import lombok.Getter;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;

import java.time.OffsetDateTime;

@Getter
public class MessageDTO {
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty
    private String message;
    @NotNull
    @NotEmpty
    private String email;
    @NotNull
    @NotEmpty
    private String timestamp;

}
