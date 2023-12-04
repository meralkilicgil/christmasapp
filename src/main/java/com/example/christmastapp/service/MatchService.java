package com.example.christmastapp.service;

import com.example.christmastapp.entity.MatchedPeople;
import com.example.christmastapp.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {
    public List<MatchedPeople> makeMatch(List<Person> personList){
        List<MatchedPeople> matchedPeopleList = new ArrayList<>();
        matchedPeopleList.add(new MatchedPeople(personList.get(0).getName(), personList.get(1)));
        return matchedPeopleList;
    }
}
