package com.example.christmastapp.dao;

import com.example.christmastapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    public List<Person> findAllByOrderByNameAsc();
}
