package com.example.demo.controller;

import com.example.demo.repository.JoinedRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.validation.Valid;

import lombok.Getter;

import com.example.demo.model.Joined;
import com.example.demo.dto.JoinDTO;

@RestController
@RequestMapping("/api")
public class BackendController {

    @Autowired
    JoinedRepository joinedRepository;

    @PostMapping("/join")
    public String join(@Valid @RequestBody JoinDTO joinDTO) {
        Joined joined = new Joined(joinDTO.getEmail());
        joinedRepository.save(joined);
        return "Stored join email: " + joinDTO.getEmail();
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}


