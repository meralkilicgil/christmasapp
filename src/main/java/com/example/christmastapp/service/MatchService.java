package com.example.christmastapp.service;

import com.example.christmastapp.entity.MatchedPeople;
import com.example.christmastapp.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class MatchService {
    public List<MatchedPeople> makeMatch(List<Person> personList){
        List<MatchedPeople> matchedPeopleList = new ArrayList<>();
        List<Person> personList2 = new ArrayList<>(personList);
        for(int i=0; i<personList.size(); i++){
            int randomint = ThreadLocalRandom.current().nextInt(0, personList2.size());
            if(randomint != i){
                matchedPeopleList.add(new MatchedPeople(personList.get(i).getName(), personList2.get(randomint)));
                personList2.remove(randomint);
            }
            else {
                i--;
            }
        }
        return matchedPeopleList;
    }
}
