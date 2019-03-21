package com.example.demo.proveedor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public  interface  ProveedorRepositorio extends JpaRepository<Proveedor,Integer> {

    Proveedor findById(int id);
    Proveedor findByCodigoIdFiscal(String codigoIdFiscal);
    Proveedor findByNombre(String nombre);

    List<Proveedor> findAllByOrderByCodigoIdFiscalAsc();
    List<Proveedor> findAllByOrderByCodigoIdFiscalDesc();

    List<Proveedor> findAllByOrderByNombreAsc();
    List<Proveedor> findAllByOrderByNombreDesc();

    List<Proveedor> findAllByOrderByDirPostalAsc();
    List<Proveedor> findAllByOrderByDirPostalDesc();




}