package com.example.demo.controller;

import com.example.demo.repository.JoinedRepository;
import com.example.demo.repository.MessageRepository;

import java.time.OffsetDateTime;

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
import com.example.demo.model.Message;
import com.example.demo.dto.JoinDTO;
import com.example.demo.dto.MessageDTO;

@RestController
@RequestMapping("/api")
public class BackendController {

    @Autowired
    JoinedRepository joinedRepository;
    @Autowired
    MessageRepository messageRepository;

    @PostMapping("/join")
    public String join(@Valid @RequestBody JoinDTO joinDTO) {
        Joined joined = new Joined(joinDTO.getEmail());
        joinedRepository.save(joined);
        return "Stored join email: " + joinDTO.getEmail();
    }

    @PostMapping("/message")
    @ResponseBody
    public Message message(@Valid @RequestBody MessageDTO messageDTO) {
        Message message = new Message();
        message.setMessage_name(messageDTO.getName());
        message.setMessage_email(messageDTO.getEmail());
        message.setMessage(messageDTO.getMessage());
        // Assuming the timestamp string is in ISO-8601 format, e.g., 2020-10-31T01:30:00.000+05:30
        message.setMessage_timestamp(OffsetDateTime.parse(messageDTO.getTimestamp()));

        messageRepository.save(message);
        
        return message;
    }
    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}


