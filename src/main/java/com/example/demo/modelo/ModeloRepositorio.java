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

    List<Modelo> findByUnidadMonetariaContainingOrderByPesoAsc(String unidadMonetaria);
    List<Modelo> findByUnidadMonetariaContainingOrderByPesoDesc(String unidadMonetaria);
    List<Modelo> findByUnidadMonetariaContainingOrderByDiametroDesc(String unidadMonetaria);
    List<Modelo> findByUnidadMonetariaContainingOrderByDiametroAsc(String unidadMonetaria);
    List<Modelo> findByUnidadMonetariaContainingOrderByUnidadMonetariaAsc(String unidadMonetaria);
    List<Modelo> findByUnidadMonetariaContainingOrderByUnidadMonetariaDesc(String unidadMonetaria);
    List<Modelo> findByUnidadMonetariaContainingOrderByValorFacialAsc(String unidadMonetaria);
    List<Modelo> findByUnidadMonetariaContainingOrderByValorFacialDesc(String unidadMonetaria);

    List<Modelo> findByValorFacialBetweenOrderByPesoAsc(int v1,int vf2);
    List<Modelo> findByValorFacialBetweenOrderByPesoDesc(int v1,int vf2);
    List<Modelo> findByValorFacialBetweenOrderByDiametroDesc(int v1,int vf2);
    List<Modelo> findByValorFacialBetweenOrderByDiametroAsc(int v1,int vf2);
    List<Modelo> findByValorFacialBetweenOrderByUnidadMonetariaAsc(int v1,int vf2);
    List<Modelo> findByValorFacialBetweenOrderByUnidadMonetariaDesc(int v1,int vf2);
    List<Modelo> findByValorFacialBetweenOrderByValorFacialAsc(int v1,int vf2);
    List<Modelo> findByValorFacialBetweenOrderByValorFacialDesc(int v1,int vf2);

    List<Modelo> findByPesoBetweenOrderByPesoAsc(double p1,double p2);
    List<Modelo> findByPesoBetweenOrderByPesoDesc(double p1,double p2);
    List<Modelo> findByPesoBetweenOrderByDiametroDesc(double p1,double p2);
    List<Modelo> findByPesoBetweenOrderByDiametroAsc(double p1,double p2);
    List<Modelo> findByPesoBetweenOrderByUnidadMonetariaAsc(double p1,double p2);
    List<Modelo> findByPesoBetweenOrderByUnidadMonetariaDesc(double p1,double p2);
    List<Modelo> findByPesoBetweenOrderByValorFacialAsc(double p1,double p2);
    List<Modelo> findByPesoBetweenOrderByValorFacialDesc(double p1,double p2);

    List<Modelo> findByDiametroBetweenOrderByPesoAsc(double d1,double d2);
    List<Modelo> findByDiametroBetweenOrderByPesoDesc(double d1,double d2);
    List<Modelo> findByDiametroBetweenOrderByDiametroDesc(double d1,double d2);
    List<Modelo> findByDiametroBetweenOrderByDiametroAsc(double d1,double d2);
    List<Modelo> findByDiametroBetweenOrderByUnidadMonetariaAsc(double d1,double d2);
    List<Modelo> findByDiametroBetweenOrderByUnidadMonetariaDesc(double d1,double d2);
    List<Modelo> findByDiametroBetweenOrderByValorFacialAsc(double d1,double d2);
    List<Modelo> findByDiametroBetweenOrderByValorFacialDesc(double d1,double d2);




}




