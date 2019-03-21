package com.example.demo.controladores;

import com.example.demo.modelo.ModeloServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorInicio {
    @GetMapping(path = "/Inicio")
    public String inicio(Model model){
        model.addAttribute("elementoTipo", 1);//Cuando sea un modelo le pasamos al javascript un 1
        return "Inicio";
    }
}
