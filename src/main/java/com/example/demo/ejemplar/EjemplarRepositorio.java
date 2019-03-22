package com.example.demo.ejemplar;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
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
    List<Ejemplar> findByAnyoBetween(int ini,int fin);
    List<Ejemplar> findByFechaAdquisicionBetween(Date ini, Date fin);
    List<Ejemplar> findByProveedorNombreContaining(String name);
    List<Ejemplar> findByCiudadAcuContaining(String ciudad);

    List<Ejemplar> findByProveedor_CodigoIdFiscal(String codigoIdFiscal);


    List<Ejemplar> findByFechaAdquisicionBetweenOrderByFechaAdquisicionAsc(Date ini,Date fin);
    List<Ejemplar> findByFechaAdquisicionBetweenOrderByFechaAdquisicionDesc(Date ini,Date fin);
    List<Ejemplar> findByFechaAdquisicionBetweenOrderByCiudadAcuAsc(Date ini,Date fin);
    List<Ejemplar> findByFechaAdquisicionBetweenOrderByCiudadAcuDesc(Date ini,Date fin);
    List<Ejemplar> findByFechaAdquisicionBetweenOrderByAnyoAsc(Date ini,Date fin);
    List<Ejemplar> findByFechaAdquisicionBetweenOrderByAnyoDesc(Date ini,Date fin);
    List<Ejemplar> findByFechaAdquisicionBetweenOrderByProveedorNombreAsc(Date ini,Date fin);
    List<Ejemplar> findByFechaAdquisicionBetweenOrderByProveedorNombreDesc(Date ini,Date fin);

    List<Ejemplar> findByAnyoBetweenOrderByFechaAdquisicionAsc(int ini,int fin);
    List<Ejemplar> findByAnyoBetweenOrderByFechaAdquisicionDesc(int ini,int fin);
    List<Ejemplar> findByAnyoBetweenOrderByCiudadAcuAsc(int ini,int fin);
    List<Ejemplar> findByAnyoBetweenOrderByCiudadAcuDesc(int ini,int fin);
    List<Ejemplar> findByAnyoBetweenOrderByAnyoAsc(int ini,int fin);
    List<Ejemplar> findByAnyoBetweenOrderByAnyoDesc(int ini,int fin);
    List<Ejemplar> findByAnyoBetweenOrderByProveedorNombreAsc(int ini,int fin);
    List<Ejemplar> findByAnyoBetweenOrderByProveedorNombreDesc(int ini,int fin);

    List<Ejemplar> findByCiudadAcuContainingOrderByFechaAdquisicionAsc(String ciudad);
    List<Ejemplar> findByCiudadAcuContainingOrderByFechaAdquisicionDesc(String ciudad);
    List<Ejemplar> findByCiudadAcuContainingOrderByCiudadAcuAsc(String ciudad);
    List<Ejemplar> findByCiudadAcuContainingOrderByCiudadAcuDesc(String ciudad);
    List<Ejemplar> findByCiudadAcuContainingOrderByAnyoAsc(String ciudad);
    List<Ejemplar> findByCiudadAcuContainingOrderByAnyoDesc(String ciudad);
    List<Ejemplar> findByCiudadAcuContainingOrderByProveedorNombreAsc(String ciudad);
    List<Ejemplar> findByCiudadAcuContainingOrderByProveedorNombreDesc(String ciudad);

    List<Ejemplar> findByProveedorNombreContainingOrderByFechaAdquisicionAsc(String nombre);
    List<Ejemplar> findByProveedorNombreContainingOrderByFechaAdquisicionDesc(String nombre);
    List<Ejemplar> findByProveedorNombreContainingOrderByCiudadAcuAsc(String nombre);
    List<Ejemplar> findByProveedorNombreContainingOrderByCiudadAcuDesc(String nombre);
    List<Ejemplar> findByProveedorNombreContainingOrderByAnyoAsc(String nombre);
    List<Ejemplar> findByProveedorNombreContainingOrderByAnyoDesc(String nombre);
    List<Ejemplar> findByProveedorNombreContainingOrderByProveedorNombreAsc(String nombre);
    List<Ejemplar> findByProveedorNombreContainingOrderByProveedorNombreDesc(String nombre);





}
