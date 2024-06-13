package com.EDP.TiendaProyectJavaTT.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")

public class HolaMundo {
    @GetMapping("/Compras")
    public String HolaMundo(){
        String  a = "a1";
        String b = "b2";
        String c = a + b;

        return "Hola Mundo, empezando con Spring Boot, el codigo es " + c;

    }

}
