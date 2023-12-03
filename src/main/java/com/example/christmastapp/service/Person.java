package com.example.christmastapp.service;


public class Person {
    private String name;
    private Person matchedPerson;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMatchedPerson() {
        return matchedPerson;
    }

    public void setMatchedPerson(Person matchedPerson) {
        this.matchedPerson = matchedPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", matchedPerson=" + matchedPerson +
                '}';
    }
}
