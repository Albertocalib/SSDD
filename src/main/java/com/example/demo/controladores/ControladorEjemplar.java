package com.example.demo.controladores;


import com.example.demo.ejemplar.Ejemplar;
import com.example.demo.ejemplar.EjemplarServicio;
import com.example.demo.modelo.Modelo;
import com.example.demo.modelo.ModeloServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.proveedor.Proveedor;
import com.example.demo.proveedor.ProveedorServicio;

import java.sql.Date;
import java.util.List;

@Controller
public class ControladorEjemplar {

    @Autowired
    private EjemplarServicio ejemplarServicio;
    @Autowired
    private ModeloServicio modeloServicio;
    @Autowired
    private ProveedorServicio proveedorServicio;

    @RequestMapping(value = "/Inicio/crearEjemplar", method = RequestMethod.POST)
    public String crearEjemplar(Model model, @RequestParam String nombreModelo, @RequestParam String codigoIdFiscal, @RequestParam Date fechaAdquisicion, @RequestParam String ciudadAcunyacion, @RequestParam int anyo, @RequestParam String estado){


        Modelo modelo = modeloServicio.buscarPorNombreModelo(nombreModelo);
        if(modelo == null){
            return "inicio"; //Aqui hay que mostrar un error: El com.example.demo.modelo no existe.
        }
        Proveedor proveedor = proveedorServicio.buscarPorCodigoIdFiscal(codigoIdFiscal);
        if(proveedor == null){
             return "inicio"; //Aqui hay que mostrar un error: El com.example.demo.proveedor no existe.
        }

        Ejemplar ejemplar = new Ejemplar(fechaAdquisicion, ciudadAcunyacion, anyo, estado, modelo, proveedor);
        ejemplarServicio.guardar(ejemplar);
        proveedor.addEjemplar(ejemplar);
        return "inicio";


    }
    @GetMapping(path = "/Inicio/Ejemplares")
    public String mostrarEjemplares(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodos();
        model.addAttribute("elementos",lista);
        return "Inicio";
    }
    @RequestMapping (value= "/Inicio/borrarModelo{id}",method = RequestMethod.POST)
    public String eliminarEjemplar (Model model, @PathVariable int id){
        ejemplarServicio.borrar(id);
        return "Inicio";
    }
}
