package com.jaya.springboot.controller;

import com.jaya.springboot.model.Person;
import com.jaya.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonRepository repository;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
       System.out.println("Get all Persons...");

       List<Person> persons = new ArrayList<>();
       repository.findAll().forEach(persons::add);

       return persons;
    }

    @GetMapping("persons/{name}")
    public List<Person> findByName(@PathVariable String name) {

        List<Person> persons = repository.findByName(name);
        return persons;
    }
}