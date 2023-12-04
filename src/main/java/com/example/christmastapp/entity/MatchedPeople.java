package com.example.christmastapp.entity;

public class MatchedPeople {
    private String name;

    private Person matchedPerson;

    public MatchedPeople(String name, Person matchedPerson) {
        this.name = name;
        this.matchedPerson = matchedPerson;
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
}
