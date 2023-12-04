package com.example.christmastapp.service;

import com.example.christmastapp.entity.Person;

import java.util.List;

public interface PersonServiceImpl {
    public List<Person> findAll();
    Person findById(int id);
    void save(Person person);
    void deleteById(int id);
    void updatePerson(int id, Person person);
}
