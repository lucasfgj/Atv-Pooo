package com.javaspring.aula.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class welcome {
    @GetMapping("")
    public String welcome(){
        return "Bem-vindo(a)!";
    }
}

