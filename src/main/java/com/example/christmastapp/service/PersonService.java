package com.example.christmastapp.service;

import com.example.christmastapp.dao.PersonRepository;
import com.example.christmastapp.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements PersonServiceImpl{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAllByOrderByNameAsc();
    }

    @Override
    public Person findById(int id) {
        Optional<Person> result = personRepository.findById(id);
        Person person = null;
        if(result.isPresent()){
            person = result.get();
        }
        else{
            throw new NullPointerException("Person not found");
        }
        return person;
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void deleteById(int id) {
        personRepository.deleteById(id);
    }

    @Override
    public void updatePerson(int id, Person person) {
        person.setId(id);
        personRepository.save(person);
    }
}
