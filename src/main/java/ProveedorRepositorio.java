package Proveedor;

import org.springframework.data.jpa.repository.JpaRepository;


public  interface  ProveedorRepositorio extends JpaRepository<Proveedor,Integer> {

    Proveedor findById(int id);
    Proveedor findByCodigoIdFiscal(String codigoIdFiscal);
    Proveedor findByNombre(String nombre);

}