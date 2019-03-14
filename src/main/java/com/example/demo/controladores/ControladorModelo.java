package com.example.demo.controladores;

import com.example.demo.modelo.Modelo;
import com.example.demo.modelo.ModeloServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashSet;
import java.util.List;


@Controller
public class ControladorModelo {
    @Autowired
    private ModeloServicio modeloServicio;
    @RequestMapping(value = "/Inicio/crearModelo", method = RequestMethod.POST)
    public String crearModelo(Model model, @RequestParam MultipartFile file, @RequestParam int valorFacial, @RequestParam double peso, @RequestParam double diametro, @RequestParam String metales,@RequestParam String descripcion, @RequestParam String unidadMonetaria) throws IOException {
        Modelo m=new Modelo(valorFacial,unidadMonetaria,diametro,peso,descripcion, "data:image/png;base64,"+ Base64.getEncoder().encodeToString(file.getBytes()));
        LinkedHashSet<String> metalesA=  new LinkedHashSet<>(Arrays.asList(metales.split(",")));
        m.setMetales(metalesA);
        modeloServicio.guardar(m);
        return "Inicio";
    }
    @GetMapping (value = "/Inicio/borrarModelo{id}")
    public String eliminarModelo(Model model, @PathVariable int id){
        modeloServicio.borrar(id);
        return "Inicio";
    }
    @GetMapping(path = "/Inicio/Modelos")
    public String mostrarModelos(Model model){
        List<Modelo> lista = modeloServicio.buscarTodos();
        model.addAttribute("listaModelos",lista);
        return "BusquedaModelo";
    }
}
