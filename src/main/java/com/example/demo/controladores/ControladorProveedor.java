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
        model.addAttribute("elementoTipo", 3);
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
                lista = proveedorServicio.buscarPorCodigoIdFiscalOrdenadoPorCodigoFiscalAsc(codigoFiscal);
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreOrdenadoPorCodigoFiscalAsc(nombre);
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDirPostalOrdenadoPorCodigoFiscalAsc(direccion);
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
                lista = proveedorServicio.buscarPorCodigoIdFiscalOrdenadoPorCodigoFiscalDesc(codigoFiscal);
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreOrdenadoPorCodigoFiscalDesc(nombre);
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDirPostalOrdenadoPorCodigoFiscalDesc(direccion);
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
                lista = proveedorServicio.buscarPorCodigoIdFiscalOrdenadoPorNombreAsc(codigoFiscal);
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreOrdenadoPorNombreAsc(nombre);
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDirPostalOrdenadoPorNombreAsc(direccion);
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
                lista = proveedorServicio.buscarPorCodigoIdFiscalOrdenadoPorNombreDesc(codigoFiscal);
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreOrdenadoPorNombreDesc(direccion);
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDirPostalOrdenadoPorNombreDesc(direccion);
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
                lista = proveedorServicio.buscarPorCodigoIdFiscalOrdenadoPorDireccionPostalAsc(codigoFiscal);
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreOrdenadoPorDireccionPostalAsc(nombre);
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDirPostalOrdenadoPorDireccionPostalAsc(direccion);
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
                lista = proveedorServicio.buscarPorCodigoIdFiscalOrdenadoPorDireccionPostalDesc(codigoFiscal);
                model.addAttribute("listaProveedores", lista);
                break;
            case "NP":
                lista = proveedorServicio.buscarPorNombreOrdenadoPorDireccionPostalDesc(nombre);
                model.addAttribute("listaProveedores", lista);
                break;
            case "DP":
                lista = proveedorServicio.buscarPorDirPostalOrdenadoPorDireccionPostalDesc(direccion);
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
    @RequestMapping (value= "/Inicio/modificarProveedor{id}",method = RequestMethod.POST)
    public String modificarModelo(Model model, @PathVariable int id , @RequestParam String codigoIdFiscal, @RequestParam String nombreProveedor, @RequestParam String dirPostal, @RequestParam String email, @RequestParam int telefono) {
        Proveedor p=proveedorServicio.buscarPorId(id);
        p.setCodigoIdFiscal(codigoIdFiscal);
        p.setDirPostal(dirPostal);
        p.setEmail(email);
        p.setNombre(nombreProveedor);
        p.setTelefono(telefono);
        proveedorServicio.guardar(p);
        model.addAttribute("elementoTipo", 3);//Cuando sea un proovedor le pasamos al javascript un 3
        return "Inicio";
    }
}
