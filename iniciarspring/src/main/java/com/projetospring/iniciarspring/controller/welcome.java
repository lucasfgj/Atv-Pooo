package com.projetospring.iniciarspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class welcome {
    @RequestMapping
    public String welcome() {
        
        return "Bem-vindo ao Projeto Spring!";

    }
}
