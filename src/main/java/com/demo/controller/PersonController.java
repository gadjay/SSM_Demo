package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.Person;
import com.demo.service.PersonService;

@Controller
@RequestMapping("/personController")
public class PersonController {
    
    private PersonService personService;
    
    public PersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/showPerson")
    public String showPersons(Model model){
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        return "showperson";
    }
}
