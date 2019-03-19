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

}
