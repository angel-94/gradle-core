package com.mars.gradle.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * CoreController:
 * description:
 */

@RestController
@RequestMapping(value = "v1/core")
public class CoreController {

    @GetMapping
    public String helloWorld() {
        return "Hello world!!!";
    }

}
