package com.mars.gradle.core.controller;

import com.mars.gradle.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * AnimalController:
 * description:
 */

@RestController
@RequestMapping(value = "v1/core/animal")
public class AnimalController {


    @GetMapping
    public Animal gePerson() {
        Animal animal = new Animal();
        animal.setName("Animal Name Example");
        animal.setInExtinction(true);
        animal.setPet(true);
        animal.setSize("Is very big");
        return animal;
    }

}
