package com.example.atvapirest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



public class Wellcome {
    @RequestMapping("/Boas-vindas")
    public String welcome(){
        return "Bem vindo!!";
    }

    @RequestMapping("/dev")
    public String dev(){
        return "Lucas Gabriel";
    }
}
