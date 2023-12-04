package com.example.christmastapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    /*@OneToOne
    private Person matchedPerson;*/

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public Person getMatchedPerson() {
        return matchedPerson;
    }

    public void setMatchedPerson(Person matchedPerson) {
        this.matchedPerson = matchedPerson;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
