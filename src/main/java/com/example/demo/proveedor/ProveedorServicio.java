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
}
