package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.proveedor.Proveedor;
import com.example.demo.proveedor.ProveedorServicio;

@Controller
public class ControladorProveedor {
    @Autowired
    ProveedorServicio proveedorServicio;

    @RequestMapping(value = "/Inicio/crearProveedor", method = RequestMethod.POST)
    public String crearProveedor(Model model, @RequestParam String codigoIdFiscal, @RequestParam String nombreProveedor, @RequestParam String dirPostal, @RequestParam String email, @RequestParam int telefono){

        Proveedor proveedor = new Proveedor(codigoIdFiscal, nombreProveedor, dirPostal, email, telefono);
        proveedorServicio.guardar(proveedor);

        return "inicio";
    }
    @GetMapping(path = "/Inicio/Proveedores")
    public String mostrarProveedores(Model model){
        return "Inicio";
    }
}
