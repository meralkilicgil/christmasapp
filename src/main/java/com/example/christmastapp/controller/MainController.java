package com.example.christmastapp.controller;

import com.example.christmastapp.dao.PersonRepository;
import com.example.christmastapp.entity.MatchedPeople;
import com.example.christmastapp.entity.Person;
import com.example.christmastapp.service.MatchService;
import com.example.christmastapp.service.PersonService;
import com.example.christmastapp.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    private PersonService personService;
    private MatchService matchService;

    public MainController(PersonService personService, MatchService matchService) {
        this.personService = personService;
        this.matchService = matchService;
    }

    @GetMapping("/")
    public String index(Model model){
        List<Person> peopleList = personService.findAll();
        model.addAttribute("peopleList", peopleList);
        return "index";
    }


    @GetMapping("/addPeople")
    public String getAddPeoplePage(Model model){
        Person person = new Person();
        model.addAttribute("person", person);
        return "addPeople";
    }

    @PostMapping("/addPeople")
    public String addPeople(@ModelAttribute("person") Person person, Model model){
        System.out.println(person.toString());
        model.addAttribute("message", "New person is added: " + person.getName());
        personService.save(person);
        return "redirect:/";
    }


    @GetMapping("/deletePerson/{id}")
    public String deletePerson(@PathVariable(name="id") int id, Model model){
        personService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/makeMatch")
    public String matchResults(Model model){
        List<Person> peopleList = personService.findAll();
        List<MatchedPeople> matchResult = matchService.makeMatch(peopleList);
        model.addAttribute("matchedPeopleList", matchResult);
        return "matchResults";
    }
    @GetMapping("/retryMatch")
    public String retryMatch(){
        return "redirect:/makeMatch";
    }

}
