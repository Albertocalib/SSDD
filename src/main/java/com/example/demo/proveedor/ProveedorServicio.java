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


    public List<Proveedor> buscarPorNombreOrdenadoPorCodigoFiscalAsc(String nombre){return proveedorRepositorio.findByNombreContainingOrderByCodigoIdFiscalAsc(nombre);}
    public List<Proveedor> buscarPorNombreOrdenadoPorCodigoFiscalDesc(String nombre){return proveedorRepositorio.findByNombreContainingOrderByCodigoIdFiscalDesc(nombre);}
    public List<Proveedor> buscarPorNombreOrdenadoPorDireccionPostalAsc(String nombre){return proveedorRepositorio.findByNombreContainingOrderByDirPostalAsc(nombre);}
    public List<Proveedor> buscarPorNombreOrdenadoPorDireccionPostalDesc(String nombre){return proveedorRepositorio.findByNombreContainingOrderByDirPostalDesc(nombre);}
    public List<Proveedor> buscarPorNombreOrdenadoPorNombreAsc(String nombre){return proveedorRepositorio.findByNombreContainingOrderByNombreAsc(nombre);}
    public List<Proveedor> buscarPorNombreOrdenadoPorNombreDesc(String nombre){return proveedorRepositorio.findByNombreContainingOrderByNombreDesc(nombre);}

    public List<Proveedor> buscarPorDirPostalOrdenadoPorCodigoFiscalAsc(String nombre){return proveedorRepositorio.findByDirPostalContainingOrderByCodigoIdFiscalAsc(nombre);}
    public List<Proveedor> buscarPorDirPostalOrdenadoPorCodigoFiscalDesc(String nombre){return proveedorRepositorio.findByDirPostalContainingOrderByCodigoIdFiscalDesc(nombre);}
    public List<Proveedor> buscarPorDirPostalOrdenadoPorDireccionPostalAsc(String nombre){return proveedorRepositorio.findByDirPostalContainingOrderByDirPostalAsc(nombre);}
    public List<Proveedor> buscarPorDirPostalOrdenadoPorDireccionPostalDesc(String nombre){return proveedorRepositorio.findByDirPostalContainingOrderByDirPostalDesc(nombre);}
    public List<Proveedor> buscarPorDirPostalOrdenadoPorNombreAsc(String nombre){return proveedorRepositorio.findByDirPostalContainingOrderByNombreAsc(nombre);}
    public List<Proveedor> buscarPorDirPostalOrdenadoPorNombreDesc(String nombre){return proveedorRepositorio.findByDirPostalContainingOrderByNombreDesc(nombre);}

    public List<Proveedor> buscarPorCodigoIdFiscalOrdenadoPorCodigoFiscalAsc(String nombre){return proveedorRepositorio.findByCodigoIdFiscalContainingOrderByCodigoIdFiscalAsc(nombre);}
    public List<Proveedor> buscarPorCodigoIdFiscalOrdenadoPorCodigoFiscalDesc(String nombre){return proveedorRepositorio.findByCodigoIdFiscalContainingOrderByCodigoIdFiscalDesc(nombre);}
    public List<Proveedor> buscarPorCodigoIdFiscalOrdenadoPorDireccionPostalAsc(String nombre){return proveedorRepositorio.findByCodigoIdFiscalContainingOrderByDirPostalAsc(nombre);}
    public List<Proveedor> buscarPorCodigoIdFiscalOrdenadoPorDireccionPostalDesc(String nombre){return proveedorRepositorio.findByCodigoIdFiscalContainingOrderByDirPostalDesc(nombre);}
    public List<Proveedor> buscarPorCodigoIdFiscalOrdenadoPorNombreAsc(String nombre){return proveedorRepositorio.findByCodigoIdFiscalContainingOrderByNombreAsc(nombre);}
    public List<Proveedor> buscarPorCodigoIdFiscalOrdenadoPorNombreDesc(String nombre){return proveedorRepositorio.findByCodigoIdFiscalContainingOrderByNombreDesc(nombre);}

}
