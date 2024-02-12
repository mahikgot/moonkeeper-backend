package com.example.demo.dto;

import lombok.Getter;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;

@Getter
public class JoinDTO {
    @NotNull
    @NotEmpty
    private String email;
}
