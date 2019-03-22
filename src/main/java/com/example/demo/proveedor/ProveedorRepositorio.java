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

    List<Proveedor> findByNombreContaining(String nombre);
    List<Proveedor> findByDirPostalContaining(String direcion);
    List<Proveedor> findByCodigoIdFiscalContaining(String codigo);


    List<Proveedor> findByNombreContainingOrderByCodigoIdFiscalAsc(String nombre);
    List<Proveedor> findByNombreContainingOrderByCodigoIdFiscalDesc(String nombre);
    List<Proveedor> findByNombreContainingOrderByDirPostalAsc(String nombre);
    List<Proveedor> findByNombreContainingOrderByDirPostalDesc(String nombre);
    List<Proveedor> findByNombreContainingOrderByNombreAsc(String nombre);
    List<Proveedor> findByNombreContainingOrderByNombreDesc(String nombre);

    List<Proveedor> findByDirPostalContainingOrderByCodigoIdFiscalAsc(String dir);
    List<Proveedor> findByDirPostalContainingOrderByCodigoIdFiscalDesc(String dir);
    List<Proveedor> findByDirPostalContainingOrderByDirPostalAsc(String dir);
    List<Proveedor> findByDirPostalContainingOrderByDirPostalDesc(String dir);
    List<Proveedor> findByDirPostalContainingOrderByNombreAsc(String dir);
    List<Proveedor> findByDirPostalContainingOrderByNombreDesc(String dir);

    List<Proveedor> findByCodigoIdFiscalContainingOrderByCodigoIdFiscalAsc(String codigo);
    List<Proveedor> findByCodigoIdFiscalContainingOrderByCodigoIdFiscalDesc(String codigo);
    List<Proveedor> findByCodigoIdFiscalContainingOrderByDirPostalAsc(String codigo);
    List<Proveedor> findByCodigoIdFiscalContainingOrderByDirPostalDesc(String codigo);
    List<Proveedor> findByCodigoIdFiscalContainingOrderByNombreAsc(String codigo);
    List<Proveedor> findByCodigoIdFiscalContainingOrderByNombreDesc(String codigo);






}
