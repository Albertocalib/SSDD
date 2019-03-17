package com.example.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {
    @GetMapping(path = "/Inicio")
    public String inicio(Model model){
        return "Inicio";
    }
}
