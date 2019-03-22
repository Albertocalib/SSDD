package com.example.demo.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloServicio {
    @Autowired
    private ModeloRepositorio repositorio;

    public Modelo buscarPorId(int id) {
        return repositorio.findById(id);
    }

    public Modelo buscarPorValorFacialyUnidadMonetaria(int valorFacial,String unidadMonetaria){return repositorio.findByValorFacialAndUnidadMonetaria(valorFacial,unidadMonetaria);}

    public List<Modelo> buscarTodos (){
        return repositorio.findAll();
    }

    public void guardar(Modelo modelo) {
        repositorio.save(modelo);
    }

    public void borrar(int id) {
        repositorio.deleteById(id);
    }

    public List<Modelo> buscarTodosOrdenadosPorValorFacialAsc(){return repositorio.findAllByOrderByValorFacialAsc();}
    public List<Modelo> buscarTodosOrdenadosPorValorFacialDes(){return repositorio.findAllByOrderByValorFacialDesc();}
    public List<Modelo> buscarTodosOrdenadosPorUnidadMonetariaAsc(){return repositorio.findAllByOrderByUnidadMonetariaAsc();}
    public List<Modelo> buscarTodosOrdenadosPorUnidadMonetariaDesc(){return repositorio.findAllByOrderByUnidadMonetariaDesc();}
    public List<Modelo> buscarTodosOrdenadosPorPesoAsc(){return repositorio.findAllByOrderByPesoAsc();}
    public List<Modelo> buscarTodosOrdenadosPorPesoDesc(){return repositorio.findAllByOrderByPesoDesc();}
    public List<Modelo> buscarTodosOrdenadosPorDiametroAsc(){return repositorio.findAllByOrderByDiametroAsc();}
    public List<Modelo> buscarTodosOrdenadosPorDiametroDesc(){return repositorio.findAllByOrderByDiametroDesc();}
    public List<Modelo> filtrarPorUnidadMonetaria(String unidad){return this.repositorio.findByUnidadMonetariaContaining(unidad);}
    public List<Modelo> filtrarPorValorFacial(int min,int max){return this.repositorio.findByValorFacialBetween(min,max);}
    public List<Modelo> filtraPorPeso(double min,double max){return this.repositorio.findByPesoBetween(min,max);}
    public List<Modelo> filtratPorDiametro(double min,double max){return this.repositorio.findByDiametroBetween(min,max);}
}
