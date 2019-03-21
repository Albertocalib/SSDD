package com.example.demo.ejemplar;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EjemplarRepositorio extends JpaRepository<Ejemplar,Integer>  {
    Ejemplar findById (int id);
    List<Ejemplar> findByModelo_ValorFacialAndModelo_UnidadMonetaria(int valorFacial,String unidadMonetaria);
    List<Ejemplar> findAllByOrderByFechaAdquisicionAsc();
    List<Ejemplar> findAllByOrderByFechaAdquisicionDesc();
    List<Ejemplar> findAllByOrderByCiudadAcuAsc();
    List<Ejemplar> findAllByOrderByCiudadAcuDesc();
    List<Ejemplar> findAllByOrderByAnyoAsc();
    List<Ejemplar> findAllByOrderByAnyoDesc();
    List<Ejemplar> findAllByOrderByProveedorAsc();
    List<Ejemplar> findAllByOrderByProveedorDesc();

    List<Ejemplar> findByProveedor_CodigoIdFiscal(String codigoIdFiscal);

}
