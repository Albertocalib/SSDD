package Ejemplar;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EjemplarServicio {
    @Autowired
    private EjemplarRepositorio repositorio;

    public void delete(int id) {
        repositorio.deleteById(id);
    }
    public Ejemplar findById(int id){
       return repositorio.findById(id);
    }
    public void delete(Ejemplar e) {
        repositorio.delete(e);
    }
    public void save(Ejemplar ejemplar) {
        repositorio.save(ejemplar);
    }
    public List<Ejemplar> findAll() {
        return repositorio.findAll();
    }

}
