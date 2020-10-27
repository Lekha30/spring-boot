package com.jaya.springboot.repository;

import com.jaya.springboot.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByName(String name);
}
