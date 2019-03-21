package com.example.demo.ejemplar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EjemplarServicio {
    @Autowired
    private EjemplarRepositorio repositorio;

    public void borrar(int id) {
        repositorio.deleteById(id);
    }
    public Ejemplar buscarPorId(int id){
       return repositorio.findById(id);
    }
    public void borrar(Ejemplar e) {
        repositorio.delete(e);
    }
    public void guardar(Ejemplar ejemplar) {
        repositorio.save(ejemplar);
    }
    public List<Ejemplar> buscarTodos() {
        return repositorio.findAll();
    }
    public List<Ejemplar> buscarPorModelos(int valorFacial, String unidadMonetaria){return repositorio.findByModelo_ValorFacialAndModelo_UnidadMonetaria(valorFacial,unidadMonetaria); }
    public List<Ejemplar> buscarTodosOrdenadosFechasAdquisicion(){return repositorio.findAllByOrderByFechaAdquisicionAsc();}
    public List<Ejemplar> buscarTodosOrdenadosFechasAdquisicionDes(){return repositorio.findAllByOrderByFechaAdquisicionDesc();}
    public List<Ejemplar> buscarTodosOrdenadosCiudadAcunacion(){return repositorio.findAllByOrderByCiudadAcuAsc();}
    public List<Ejemplar> buscarTodosOrdenadosCiudadAcunacionDes(){return repositorio.findAllByOrderByCiudadAcuDesc();}
    public List<Ejemplar> buscarTodosOrdenadosAnoAcunacion(){return repositorio.findAllByOrderByAnyoAsc();}
    public List<Ejemplar> buscarTodosOrdenadosAnoAcunacionDes(){return repositorio.findAllByOrderByAnyoDesc();}
    public List<Ejemplar> buscarTodosOrdenadosNombreProveedor(){return repositorio.findAllByOrderByProveedorAsc();}
    public List<Ejemplar> buscarTodosOrdenadosNombreProveedorDes(){return repositorio.findAllByOrderByProveedorDesc();}

    public List<Ejemplar> buscarPorProveedor(String codigoIdFiscal){return repositorio.findByProveedor_CodigoIdFiscal(codigoIdFiscal);}


}
