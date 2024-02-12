package com.example.demo.repository;

import org.springframework.data.repository.Repository;
import com.example.demo.model.Message;

public interface MessageRepository extends Repository<Message, Long> {

    void save(Message message);
}
