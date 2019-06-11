package com.mars.gradle.core.controller;

import com.mars.gradle.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * PersonController:
 * description:
 */

@RestController
@RequestMapping(value = "v1/core/person")
public class PersonController {


    @GetMapping
    public Person gePerson() {
        Person person = new Person();
        person.setName("Person Name Example");
        person.setHavePet(true);
        person.setAge(18);
        return person;
    }

}
