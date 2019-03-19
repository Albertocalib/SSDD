package com.example.demo.ejemplar;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EjemplarRepositorio extends JpaRepository<Ejemplar,Integer>  {
    Ejemplar findById (int id);
    List<Ejemplar> findByModelo_ValorFacialAndModelo_UnidadMonetaria(int valorFacial,String unidadMonetaria);
    List<Ejemplar> findAllByOrderByFechaAdquisicionAsc();

}
