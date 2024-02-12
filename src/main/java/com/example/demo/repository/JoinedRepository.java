package com.example.demo.repository;

import org.springframework.data.repository.Repository;
import com.example.demo.model.Joined;

public interface JoinedRepository extends Repository<Joined, Long> {

    void save(Joined joined);
}
