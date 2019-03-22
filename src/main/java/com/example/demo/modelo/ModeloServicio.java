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

    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorPesoAsc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByPesoAsc(unidadMonetaria);}
    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorPesoDesc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByPesoDesc(unidadMonetaria);}
    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorDiametroDesc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByDiametroDesc(unidadMonetaria);}
    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorDiametroAsc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByDiametroAsc(unidadMonetaria);}
    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorUnidadMonetariaAsc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByUnidadMonetariaAsc(unidadMonetaria);}
    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorUnidadMonetariaDesc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByUnidadMonetariaDesc(unidadMonetaria);}
    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorValorFacialAsc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByValorFacialAsc(unidadMonetaria);}
    public List<Modelo> buscarPorUnidadMonetariaOrdenadoPorValorFacialDesc(String unidadMonetaria){return this.repositorio.findByUnidadMonetariaContainingOrderByValorFacialDesc(unidadMonetaria);}


    public List<Modelo> buscarPorValorFacialOrdenadoPorPesoAsc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByPesoAsc(v1,v2);}
    public List<Modelo> buscarPorValorFacialOrdenadoPorPesoDesc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByPesoDesc(v1,v2);}
    public List<Modelo> buscarPorValorFacialOrdenadoPorDiametroDesc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByDiametroDesc(v1,v2);}
    public List<Modelo> buscarPorValorFacialOrdenadoPorDiametroAsc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByDiametroAsc(v1,v2);}
    public List<Modelo> buscarPorValorFacialOrdenadoPorUnidadMonetariaAsc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByUnidadMonetariaAsc(v1,v2);}
    public List<Modelo> buscarPorValorFacialOrdenadoPorUnidadMonetariaDesc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByUnidadMonetariaDesc(v1,v2);}
    public List<Modelo> buscarPorValorFacialOrdenadoPorValorFacialAsc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByValorFacialAsc(v1,v2);}
    public List<Modelo> buscarPorValorFacialOrdenadoPorValorFacialDesc(int v1,int v2){return this.repositorio.findByValorFacialBetweenOrderByValorFacialDesc(v1,v2);}

    public List<Modelo> buscarPorPesoOrdenadoPorPesoAsc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByPesoAsc(v1,v2);}
    public List<Modelo> buscarPorPesoOrdenadoPorPesoDesc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByPesoDesc(v1,v2);}
    public List<Modelo> buscarPorPesoOrdenadoPorDiametroDesc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByDiametroDesc(v1,v2);}
    public List<Modelo> buscarPorPesoOrdenadoPorDiametroAsc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByDiametroAsc(v1,v2);}
    public List<Modelo> buscarPorPesoOrdenadoPorUnidadMonetariaAsc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByUnidadMonetariaAsc(v1,v2);}
    public List<Modelo> buscarPorPesoOrdenadoPorUnidadMonetariaDesc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByUnidadMonetariaDesc(v1,v2);}
    public List<Modelo> buscarPorPesoOrdenadoPorValorFacialAsc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByValorFacialAsc(v1,v2);}
    public List<Modelo> buscarPorPesoOrdenadoPorValorFacialDesc(double v1,double v2){return this.repositorio.findByPesoBetweenOrderByValorFacialDesc(v1,v2);}

    public List<Modelo> buscarPorDiametroOrdenadoPorPesoAsc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByPesoAsc(v1,v2);}
    public List<Modelo> buscarPorDiametroOrdenadoPorPesoDesc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByPesoDesc(v1,v2);}
    public List<Modelo> buscarPorDiametroOrdenadoPorDiametroDesc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByDiametroDesc(v1,v2);}
    public List<Modelo> buscarPorDiametroOrdenadoPorDiametroAsc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByDiametroAsc(v1,v2);}
    public List<Modelo> buscarPorDiametroOrdenadoPorUnidadMonetariaAsc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByUnidadMonetariaAsc(v1,v2);}
    public List<Modelo> buscarPorDiametroOrdenadoPorUnidadMonetariaDesc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByUnidadMonetariaDesc(v1,v2);}
    public List<Modelo> buscarPorDiametroOrdenadoPorValorFacialAsc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByValorFacialAsc(v1,v2);}
    public List<Modelo> buscarPorDiametroOrdenadoPorValorFacialDesc(double v1,double v2){return this.repositorio.findByDiametroBetweenOrderByValorFacialDesc(v1,v2);}



}
