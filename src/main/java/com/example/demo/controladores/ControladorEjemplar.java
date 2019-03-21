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
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Date;
import java.util.Base64;
import java.util.List;

@Controller
public class ControladorEjemplar {

    @Autowired
    private EjemplarServicio ejemplarServicio;
    @Autowired
    private ModeloServicio modeloServicio;
    @Autowired
    private ProveedorServicio proveedorServicio;
    @RequestMapping(path= "/Inicio/crearEjemplar", method = RequestMethod.POST)
    public String crearEjemplar(Model model,@RequestParam MultipartFile file,@RequestParam int valorFacial, @RequestParam String unidadMonetaria, @RequestParam String codigoIdFiscal, @RequestParam Date fechaAdquisicion, @RequestParam String ciudadAcunyacion, @RequestParam int anyo, @RequestParam String estado) throws IOException {


        Modelo modelo = modeloServicio.buscarPorValorFacialyUnidadMonetaria(valorFacial,unidadMonetaria);
        if(modelo == null){
            return "Inicio"; //Aqui hay que mostrar un error: El com.example.demo.modelo no existe.
        }
        Proveedor proveedor = proveedorServicio.buscarPorCodigoIdFiscal(codigoIdFiscal);
        if(proveedor == null){
             return "InicIo"; //Aqui hay que mostrar un error: El com.example.demo.proveedor no existe.
        }

        Ejemplar ejemplar = new Ejemplar(fechaAdquisicion, ciudadAcunyacion, anyo, estado, modelo, proveedor);
        ejemplar.addImagen("data:image/png;base64,"+ Base64.getEncoder().encodeToString(file.getBytes()));
        ejemplarServicio.guardar(ejemplar);
        proveedor.addEjemplar(ejemplar);
        model.addAttribute("elementoTipo", 2);//Cuando sea un ejemplar le pasamos al javascript un 2
        return "Inicio";


    }
    @GetMapping(path = "/Inicio/Ejemplares")
    public String mostrarEjemplares(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodos();
        model.addAttribute("listaEjemplares",lista);
        return "BusquedaEjemplares";
    }
    @RequestMapping (path= "/Inicio/borrarEjemplar{id}",method = RequestMethod.POST)
    public String eliminarEjemplar (Model model, @PathVariable int id){
        ejemplarServicio.borrar(id);
        model.addAttribute("elementoTipo", 2);//Cuando sea un ejemplar le pasamos al javascript un 2
        return "Inicio";
    }
    @GetMapping(path = "/Inicio/EjemplaresModelos/{valorFacial}/{unidadMonetaria}")
    public String buscarEjemplaresModelo(Model model, @PathVariable int valorFacial,@PathVariable String unidadMonetaria){
        List<Ejemplar> lista = ejemplarServicio.buscarPorModelos(valorFacial,unidadMonetaria);
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }

    @GetMapping(path = "/Inicio/Ejemplares/FechaAdquisicion")
    public String EjemplaresFechasAdquisicion(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosFechasAdquisicion();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/FechaAdquisicionDes")
    public String EjemplaresFechasAdquisicionDes(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosFechasAdquisicionDes();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/CiudadAcunacion")
    public String EjemplaresCiudadAcunacion(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosCiudadAcunacion();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/AnoAcunacion")
    public String EjemplaresAnoAcunacion(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosAnoAcunacion();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/AnoAcunacionDes")
    public String EjemplaresAnoAcunacionDes(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosAnoAcunacionDes();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/CiudadAcunacionDes")
    public String EjemplaresCiudadAcunacionDes(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosCiudadAcunacionDes();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/NombreProveedor")
    public String EjemplaresNombreProveedor(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosNombreProveedor();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/NombreProveedorDes")
    public String EjemplaresNombreProveedorDes(Model model){
        List<Ejemplar> lista = ejemplarServicio.buscarTodosOrdenadosNombreProveedorDes();
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }

}
