package com.example.christmastapp;

import com.example.christmastapp.service.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
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
        return "addPeople";
    }


}
