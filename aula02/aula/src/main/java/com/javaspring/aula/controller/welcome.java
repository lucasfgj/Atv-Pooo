package com.javaspring.aula.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @RequestMapping("/")
    public String welcome(){
        return "Bem-vindo ao projeto Aula";
    }
    @RequestMapping("/curso")
    public String curso(){
        return "Curso: Desenvolvimento de Sistemas";
    }
    @RequestMapping("/dev")
    public String dev(){
        return "Desenvolvido por Lucas";
    }
}
