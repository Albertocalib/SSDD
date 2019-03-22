package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.proveedor.Proveedor;
import com.example.demo.proveedor.ProveedorServicio;

import java.util.List;

@Controller
public class ControladorProveedor {

    private String tipoFiltro = "NU";

    private String nombre = "";
    private String codigoFiscal = "";
    private String direccion = "";

    @Autowired
    ProveedorServicio proveedorServicio;

    @RequestMapping(value = "/Inicio/crearProveedor", method = RequestMethod.POST)
    public String crearProveedor(Model model, @RequestParam String codigoIdFiscal, @RequestParam String nombreProveedor, @RequestParam String dirPostal, @RequestParam String email, @RequestParam int telefono){

        Proveedor proveedor = new Proveedor(codigoIdFiscal, nombreProveedor, dirPostal, email, telefono);
        proveedorServicio.guardar(proveedor);
        model.addAttribute("elementoTipo", 3);//Cuando sea un proveedor le pasamos al javascript un 3
        return "Inicio";
    }

    @GetMapping(path = "/Inicio/Proveedores")
    public String mostrarProveedores(Model model){
        List<Proveedor> lista = proveedorServicio.buscarTodos();
        model.addAttribute("listaProveedores",lista);
        return "BusquedaProveedores";
    }

    @RequestMapping (value= "/Inicio/borrarProveedor{id}",method = RequestMethod.POST)
    public String eliminarProveedor(Model model, @PathVariable int id) {
        proveedorServicio.borrar(id);
        return "Inicio";
    }

    @GetMapping(path = "/Inicio/Proveedores/CodigoFiscal")
    public String proveedoresCodigoFiscal(Model model){
        List<Proveedor> lista;
        switch (tipoFiltro){
            case "NU":
                lista = proveedorServicio.buscarTodosOrdenadosPorCodigoIdFiscalAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "CF":
                lista = proveedorServicio.buscarPorCodigoFiscalOrdenadoPorCodigoFiscalAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreProveedorOrdenadoPorCodigoFiscalAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDireccionPostalOrdenadoPorCodigoFiscalAsc();;
                model.addAttribute("listaProveedores", lista);
                break;
        }
        return "BusquedaProveedores";
    }

    @GetMapping(path = "/Inicio/Proveedores/CodigoFiscalDes")
    public String proveedoresCodigoFiscalDes(Model model){
        List<Proveedor> lista;
        switch (tipoFiltro){
            case "NU":
                lista = proveedorServicio.buscarTodosOrdenadosPorCodigoIdFiscalDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "CF":
                lista = proveedorServicio.buscarPorCodigoFiscalOrdenadoPorCodigoFiscalDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreProveedorOrdenadoPorCodigoFiscalDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDireccionPostalOrdenadoPorCodigoFiscalDesc();;
                model.addAttribute("listaProveedores", lista);
                break;
        }
        return "BusquedaProveedores";
    }

    @GetMapping(path = "/Inicio/Proveedores/Nombres")
    public String proveedoresNombre(Model model){
        List<Proveedor> lista;
        switch (tipoFiltro){
            case "NU":
                lista = proveedorServicio.buscarTodosOrdenadosPorNombreAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "CF":
                lista = proveedorServicio.buscarPorCodigoFiscalOrdenadoPorNombreAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreProveedorOrdenadoPorNombreAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDireccionPostalOrdenadoPorNombreAsc();;
                model.addAttribute("listaProveedores", lista);
                break;
        }
        return "BusquedaProveedores";
    }

    @GetMapping(path = "/Inicio/Proveedores/NombresDes")
    public String proveedoresNombresDes(Model model){
        List<Proveedor> lista;
        switch (tipoFiltro){
            case "NU":
                lista = proveedorServicio.buscarTodosOrdenadosPorNombreDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "CF":
                lista = proveedorServicio.buscarPorCodigoFiscalOrdenadoPorNombreDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreProveedorOrdenadoPorNombreDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDireccionPostalOrdenadoPorNombreDesc();;
                model.addAttribute("listaProveedores", lista);
                break;
        }
        return "BusquedaProveedores";
    }

    @GetMapping(path = "/Inicio/Proveedores/DireccionPostal")
    public String proveedoresDirPostal(Model model){
        List<Proveedor> lista;
        switch (tipoFiltro){
            case "NU":
                lista = proveedorServicio.buscarTodosOrdenadosPorDirPostalAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "CF":
                lista = proveedorServicio.buscarPorCodigoFiscalOrdenadoPorDireccionPostalAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreProveedorOrdenadoPorDireccionPostalAsc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDireccionPostalOrdenadoPorDireccionPostalAsc();
                model.addAttribute("listaProveedores", lista);
                break;
        }
        return "BusquedaProveedores";
    }

    @GetMapping(path = "/Inicio/Proveedores/DireccionPostalDes")
    public String proveedoresDirPostalDes(Model model){
        List<Proveedor> lista;
        switch (tipoFiltro){
            case "NU":
                lista = proveedorServicio.buscarTodosOrdenadosPorDirPostalDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "CF":
                lista = proveedorServicio.buscarPorCodigoFiscalOrdenadoPorDireccionPostalDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreProveedorOrdenadoPorDireccionPostalDesc();
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDireccionPostalOrdenadoPorDireccionPostalDesc();
                model.addAttribute("listaProveedores", lista);
                break;
        }
        return "BusquedaProveedores";
    }
    @GetMapping(path = "/Inicio/filtroCodigoFiscal/{codigo}")
    public String filtrarCodigoIdFiscal(Model model,@PathVariable String codigo){
        tipoFiltro = "CF";
        codigoFiscal = codigo;
        List<Proveedor> lista = proveedorServicio.filtrarPorCodigoFiscal(codigo);
        model.addAttribute("listaProveedores",lista);
        return "BusquedaProveedores";
    }
    @GetMapping(path = "/Inicio/filtroNombreProveedor/{nombre}")
    public String filtrarNombreProveedor(Model model,@PathVariable String nombre){
        tipoFiltro = "NP";
        this.nombre = nombre;
        List<Proveedor> lista = proveedorServicio.filtrarPorNombre(nombre);
        model.addAttribute("listaProveedores",lista);
        return "BusquedaProveedores";
    }
    @GetMapping(path = "/Inicio/filtroDireccion/{direccion}")
    public String filtrarDireccionFiscal(Model model,@PathVariable String direccion){
        tipoFiltro = "DP";
        this.direccion = direccion;
        List<Proveedor> lista = proveedorServicio.filtrarPorDirPostal(direccion);
        model.addAttribute("listaProveedores",lista);
        return "BusquedaProveedores";
    }
}
