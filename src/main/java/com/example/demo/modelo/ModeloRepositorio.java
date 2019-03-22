package com.example.demo.modelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModeloRepositorio extends JpaRepository<Modelo,Integer> {
    List<Modelo> findAll();
    Modelo findById(int id);
    Modelo findByValorFacialAndUnidadMonetaria(int valorFacial,String unidadMonetaria);
    List<Modelo> findAllByOrderByPesoAsc();
    List<Modelo> findAllByOrderByPesoDesc();
    List<Modelo> findAllByOrderByDiametroAsc();
    List<Modelo> findAllByOrderByDiametroDesc();
    List<Modelo> findAllByOrderByUnidadMonetariaAsc();
    List<Modelo> findAllByOrderByUnidadMonetariaDesc();
    List<Modelo> findAllByOrderByValorFacialAsc();
    List<Modelo> findAllByOrderByValorFacialDesc();
    List<Modelo> findByDiametroBetween(double min,double max);
    List<Modelo> findByPesoBetween(double min,double max);
    List<Modelo> findByUnidadMonetariaContaining(String unidadMonetaria);
    List<Modelo> findByValorFacialBetween(int min,int max);




}




