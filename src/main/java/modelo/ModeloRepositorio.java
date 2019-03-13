package modelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModeloRepositorio extends JpaRepository<Modelo,Integer> {
    List<Modelo> findAll();
    Modelo findById(int id);
    Modelo findByNommbreModelo(String nombreModelo);
}




