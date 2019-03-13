package controladores;


import ejemplar.Ejemplar;
import ejemplar.EjemplarServicio;
import modelo.Modelo;
import modelo.ModeloServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import proveedor.Proveedor;
import proveedor.ProveedorServicio;

import java.sql.Date;

@Controller
public class ControladorEjemplar {

    @Autowired
    EjemplarServicio ejemplarServicio;
    @Autowired
    ModeloServicio modeloServicio;
    @Autowired
    ProveedorServicio proveedorServicio;

    @RequestMapping(value = "/Inicio/crearEjemplar", method = RequestMethod.POST)
    public String crearEjemplar(Model model, @RequestParam String nombreModelo, @RequestParam String codigoIdFiscal, @RequestParam Date fechaAdquisicion, @RequestParam String ciudadAcunyacion, @RequestParam int anyo, @RequestParam String estado){


        Modelo modelo = modeloServicio.buscarPorNombreModelo(nombreModelo);
        if(modelo == null){
            return "inicio"; //Aqui hay que mostrar un error: El modelo no existe.
        }
        Proveedor proveedor = proveedorServicio.buscarPorCodigoIdFiscal(codigoIdFiscal);
        if(proveedor == null){
             return "inicio"; //Aqui hay que mostrar un error: El proveedor no existe.
        }

        Ejemplar ejemplar = new Ejemplar(fechaAdquisicion, ciudadAcunyacion, anyo, estado, modelo, proveedor);
        ejemplarServicio.guardar(ejemplar);
        proveedor.addEjemplar(ejemplar);
        return "inicio";


    }



}
