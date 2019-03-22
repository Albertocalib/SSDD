package com.example.demo.proveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProveedorServicio {

    @Autowired
    ProveedorRepositorio proveedorRepositorio;

    public List<Proveedor> buscarTodos(){
        return proveedorRepositorio.findAll();
    }

    public Proveedor buscarPorId(int id){
        return proveedorRepositorio.findById(id);
    }

    public Proveedor buscarPorCodigoIdFiscal(String codigoIdFiscal){
        return proveedorRepositorio.findByCodigoIdFiscal(codigoIdFiscal);
    }

    public void guardar(Proveedor proveedor){
        proveedorRepositorio.save(proveedor);
    }

    public void borrar(Proveedor proveedor){
        proveedorRepositorio.delete(proveedor);
    }

    public void borrar(int id){
        proveedorRepositorio.deleteById(id);
    }

    public List<Proveedor> buscarTodosOrdenadosPorCodigoIdFiscalAsc(){return proveedorRepositorio.findAllByOrderByCodigoIdFiscalAsc();}
    public List<Proveedor> buscarTodosOrdenadosPorCodigoIdFiscalDesc(){return proveedorRepositorio.findAllByOrderByCodigoIdFiscalDesc();}

    public List<Proveedor> buscarTodosOrdenadosPorNombreAsc(){return proveedorRepositorio.findAllByOrderByNombreAsc();}
    public List<Proveedor> buscarTodosOrdenadosPorNombreDesc(){return proveedorRepositorio.findAllByOrderByNombreDesc();}

    public List<Proveedor> buscarTodosOrdenadosPorDirPostalAsc(){return proveedorRepositorio.findAllByOrderByDirPostalAsc();}
    public List<Proveedor> buscarTodosOrdenadosPorDirPostalDesc(){return proveedorRepositorio.findAllByOrderByDirPostalDesc();}

    public List<Proveedor> filtrarPorNombre(String nombre){return proveedorRepositorio.findByNombreContaining(nombre);}
    public List<Proveedor> filtrarPorDirPostal(String direcion){return proveedorRepositorio.findByDirPostalContaining(direcion);}
    public List<Proveedor> filtrarPorCodigoFiscal(String codigo){return proveedorRepositorio.findByCodigoIdFiscalContaining(codigo);}
}
