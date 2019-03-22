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

    private String tipoFiltro = "NU";

    private Date fechaAquisicion1 ;
    private Date fechaAquisicion2 ;

    private String ciudadAcu = "";

    private int ano1 ;
    private int ano2 ;

    private String proveedorNombre = "";

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
            return "Inicio"; //Aqui hay que mostrar un error: El modelo no existe.
        }
        Proveedor proveedor = proveedorServicio.buscarPorCodigoIdFiscal(codigoIdFiscal);
        if(proveedor == null){
             return "Inicio"; //Aqui hay que mostrar un error: El proveedor no existe.
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
        tipoFiltro = "NU";
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

    @GetMapping(path = "/Inicio/EjemplaresProveedor/{codigoIdFiscal}")
    public String buscarEjemplaresProveedor(Model model, @PathVariable String codigoIdFiscal){
        List<Ejemplar> lista = ejemplarServicio.buscarPorProveedor(codigoIdFiscal);
        model.addAttribute("listaEjemplares", lista);
        return "BusquedaEjemplares";
    }

    @GetMapping(path = "/Inicio/Ejemplares/FechaAdquisicion")
    public String EjemplaresFechasAdquisicion(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosFechasAdquisicion();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorFechaAdquisicionAsc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorFechaAdquisicionAsc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorFechaAdquisicionAsc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorFechaAdquisicionAsc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/FechaAdquisicionDes")
    public String EjemplaresFechasAdquisicionDes(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosFechasAdquisicionDes();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorFechaAdquisicionDesc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorFechaAdquisicionDesc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorFechaAdquisicionDesc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorFechaAdquisicionDesc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/CiudadAcunacion")
    public String EjemplaresCiudadAcunacion(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosCiudadAcunacion();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorCiudadAcuAsc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorCiudadAcuAsc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorCiudadAcuAsc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorCiudadAcuAsc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/AnoAcunacion")
    public String EjemplaresAnoAcunacion(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosAnoAcunacion();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorAnyoAsc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorAnyoAsc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorAnyoAsc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorAnyoAsc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/AnoAcunacionDes")
    public String EjemplaresAnoAcunacionDes(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosAnoAcunacionDes();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorAnyoDesc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorAnyoDesc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorAnyoDesc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorAnyoDesc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/CiudadAcunacionDes")
    public String EjemplaresCiudadAcunacionDes(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosCiudadAcunacionDes();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorCiudadAcuDesc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorCiudadAcuDesc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorCiudadAcuDesc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorCiudadAcuDesc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/NombreProveedor")
    public String EjemplaresNombreProveedor(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosNombreProveedor();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorProveedorNombreAsc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorProveedorNombreAsc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorProveedorNombreAsc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorProveedorNombreAsc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @GetMapping(path = "/Inicio/Ejemplares/NombreProveedorDes")
    public String EjemplaresNombreProveedorDes(Model model){
        List<Ejemplar> lista;
        switch (tipoFiltro){
            case "NU":
                lista = ejemplarServicio.buscarTodosOrdenadosNombreProveedorDes();
                model.addAttribute("listaEjemplares", lista);
                break;
            case "FA":
                lista = ejemplarServicio.buscarPorFechaAdquisicionOrdenadoPorProveedorNombreDesc(fechaAquisicion1,fechaAquisicion2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "CE":
                lista = ejemplarServicio.buscarPorCiudadAcuOrdenadoPorProveedorNombreDesc(ciudadAcu);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "AA":
                lista = ejemplarServicio.buscarPorAnyoOrdenadoPorProveedorNombreDesc(ano1,ano2);
                model.addAttribute("listaEjemplares", lista);
                break;
            case "PN":
                lista = ejemplarServicio.buscarPorProveedorNombreOrdenadoPorProveedorNombreDesc(proveedorNombre);
                model.addAttribute("listaEjemplares", lista);
                break;
        }
        return "BusquedaEjemplares";
    }
    @RequestMapping (path= "/Inicio/modificarEjemplar{id}",method = RequestMethod.POST)
    public String modificarEjemplar (Model model, @PathVariable int id,@RequestParam MultipartFile file,@RequestParam int valorFacial, @RequestParam String unidadMonetaria, @RequestParam String codigoIdFiscal, @RequestParam Date fechaAdquisicion, @RequestParam String ciudadAcunyacion, @RequestParam int anyo, @RequestParam String estado) throws IOException {
        Ejemplar e=ejemplarServicio.buscarPorId(id);
        if (file!=null){
            e.addImagen("data:image/png;base64,"+ Base64.getEncoder().encodeToString(file.getBytes()));
        }
        Proveedor proveedor = proveedorServicio.buscarPorCodigoIdFiscal(codigoIdFiscal);
        if (proveedor!=null){
            e.setProveedor(proveedor);
        }
        Modelo modelo = modeloServicio.buscarPorValorFacialyUnidadMonetaria(valorFacial,unidadMonetaria);
        if (modelo!=null){
            e.setModelo(modelo);
        }
        e.setAnyo(anyo);
        e.setCiudadAcu(ciudadAcunyacion);
        e.setEstado(estado);
        e.setFechaAdquisicion(fechaAdquisicion);

        model.addAttribute("elementoTipo", 2);//Cuando sea un ejemplar le pasamos al javascript un 2
        return "Inicio";
    }
    @GetMapping (path= "/Inicio/filtroFechaAdq/{fechaIni}/{fechaFin}")
    public String filtrarFecha(Model model,@PathVariable Date fechaIni,@PathVariable Date fechaFin){
        tipoFiltro = "FA";
        fechaAquisicion1 = fechaIni ;
        fechaAquisicion2 =fechaFin ;

        model.addAttribute("listaEjemplares",ejemplarServicio.filtrarPorFecha(fechaIni,fechaFin));
        return "BusquedaEjemplares";
    }
    @GetMapping (path= "/Inicio/filtroCiudad/{ciudad}")
    public String filtrarCiudad(Model model,@PathVariable String ciudad){
        tipoFiltro = "CE";
        ciudadAcu = ciudad;
        model.addAttribute("listaEjemplares",ejemplarServicio.filtrarPorCiudad(ciudad));
        return "BusquedaEjemplares";
    }
    @GetMapping (path= "/Inicio/filtroAno/{anoIni}/{anoFin}")
    public String filtrarAno(Model model,@PathVariable int anoIni,@PathVariable int anoFin){
        tipoFiltro = "AA";
        ano1 = anoIni;
        ano2 = anoFin;
        model.addAttribute("listaEjemplares",ejemplarServicio.filtrarPorAnyo(anoIni,anoFin));
        return "BusquedaEjemplares";
    }
    @GetMapping (path= "/Inicio/filtroProveedor/{proveedor}")
    public String filtrarProveedor(Model model,@PathVariable String proveedor){
        tipoFiltro = "PN";
        proveedorNombre = proveedor;
        model.addAttribute("listaEjemplares",ejemplarServicio.filtrarPorProveedor(proveedor));
        return "BusquedaEjemplares";
    }

}
