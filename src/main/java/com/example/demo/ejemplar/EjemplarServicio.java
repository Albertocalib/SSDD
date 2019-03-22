package com.example.demo.ejemplar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
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
    public List<Ejemplar> filtrarPorFecha(Date fechaIni, Date fechaFin){return repositorio.findByFechaAdquisicionBetween(fechaIni,fechaFin);}
    public List<Ejemplar> filtrarPorAnyo(int ini, int fin){return repositorio.findByAnyoBetween(ini,fin);}
    public List<Ejemplar> filtrarPorCiudad(String ciudad){return repositorio.findByCiudadAcuContaining(ciudad);}
    public List<Ejemplar> filtrarPorProveedor(String proveedor){return repositorio.findByProveedorNombreContaining(proveedor);}

    public List<Ejemplar> buscarPorProveedor(String codigoIdFiscal){return repositorio.findByProveedor_CodigoIdFiscal(codigoIdFiscal);}

    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorFechaAdquisicionAsc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByFechaAdquisicionAsc(ini,fin);}
    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorFechaAdquisicionDesc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByFechaAdquisicionDesc(ini,fin);}
    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorCiudadAcuAsc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByCiudadAcuAsc(ini,fin);}
    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorCiudadAcuDesc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByCiudadAcuDesc(ini,fin);}
    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorAnyoAsc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByAnyoAsc(ini,fin);}
    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorAnyoDesc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByAnyoDesc(ini,fin);}
    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorProveedorNombreAsc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByProveedorNombreAsc(ini,fin);}
    public List<Ejemplar> buscarPorFechaAdquisicionOrdenadoPorProveedorNombreDesc(Date ini,Date fin){return this.repositorio.findByFechaAdquisicionBetweenOrderByProveedorNombreDesc(ini,fin);}

    public List<Ejemplar> buscarPorAnyoOrdenadoPorFechaAdquisicionAsc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByFechaAdquisicionAsc(ini,fin);}
    public List<Ejemplar> buscarPorAnyoOrdenadoPorFechaAdquisicionDesc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByFechaAdquisicionDesc(ini,fin);}
    public List<Ejemplar> buscarPorAnyoOrdenadoPorCiudadAcuAsc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByCiudadAcuAsc(ini,fin);}
    public List<Ejemplar> buscarPorAnyoOrdenadoPorCiudadAcuDesc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByCiudadAcuDesc(ini,fin);}
    public List<Ejemplar> buscarPorAnyoOrdenadoPorAnyoAsc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByAnyoAsc(ini,fin);}
    public List<Ejemplar> buscarPorAnyoOrdenadoPorAnyoDesc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByAnyoDesc(ini,fin);}
    public List<Ejemplar> buscarPorAnyoOrdenadoPorProveedorNombreAsc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByProveedorNombreAsc(ini,fin);}
    public List<Ejemplar> buscarPorAnyoOrdenadoPorProveedorNombreDesc(int ini,int fin){return this.repositorio.findByAnyoBetweenOrderByProveedorNombreDesc(ini,fin);}

    public List<Ejemplar> buscarPorCiudadAcuPorFechaAdquisicionAsc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByFechaAdquisicionAsc(ciudad);}
    public List<Ejemplar> buscarPorCiudadAcuPorFechaAdquisicionDesc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByFechaAdquisicionDesc(ciudad);}
    public List<Ejemplar> buscarPorCiudadAcuPorCiudadAcuAsc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByCiudadAcuAsc(ciudad);}
    public List<Ejemplar> buscarPorCiudadAcuPorCiudadAcuDesc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByCiudadAcuDesc(ciudad);}
    public List<Ejemplar> buscarPorCiudadAcuPorAnyoAsc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByAnyoAsc(ciudad);}
    public List<Ejemplar> buscarPorCiudadAcuPorAnyoDesc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByAnyoDesc(ciudad);}
    public List<Ejemplar> buscarPorCiudadAcuPorProveedorNombreAsc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByProveedorNombreAsc(ciudad);}
    public List<Ejemplar> buscarPorCiudadAcuPorProveedorNombreDesc(String ciudad){return this.repositorio.findByCiudadAcuContainingOrderByProveedorNombreDesc(ciudad);}

    public List<Ejemplar> buscarPorProveedorNombrePorFechaAdquisicionAsc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByFechaAdquisicionAsc(nombre);}
    public List<Ejemplar> buscarPorProveedorNombrePorFechaAdquisicionDesc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByFechaAdquisicionDesc(nombre);}
    public List<Ejemplar> buscarPorProveedorNombreCiudadAcuAsc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByCiudadAcuAsc(nombre);}
    public List<Ejemplar> buscarPorProveedorNombrePorCiudadAcuDesc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByCiudadAcuDesc(nombre);}
    public List<Ejemplar> buscarPorProveedorNombrePorAnyoAsc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByAnyoAsc(nombre);}
    public List<Ejemplar> buscarPorProveedorNombrePorAnyoDesc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByAnyoDesc(nombre);}
    public List<Ejemplar> buscarPorProveedorNombrePorProveedorNombreAsc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByProveedorNombreAsc(nombre);}
    public List<Ejemplar> buscarPorProveedorNombrePorProveedorNombreDesc(String nombre){return this.repositorio.findByProveedorNombreContainingOrderByProveedorNombreDesc(nombre);}
    

}
