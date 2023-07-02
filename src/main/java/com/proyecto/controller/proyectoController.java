package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class proyectoController {
    
    @GetMapping("/")
    public String Test (){
        return "principal";
    }
}
