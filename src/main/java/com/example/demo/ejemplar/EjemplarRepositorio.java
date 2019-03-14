package com.example.demo.ejemplar;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EjemplarRepositorio extends JpaRepository<Ejemplar,Integer>  {
    Ejemplar findById (int id);
}
