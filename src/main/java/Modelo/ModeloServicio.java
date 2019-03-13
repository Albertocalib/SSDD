package Modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloServicio {
    @Autowired
    private ModeloRepositorio repositorio;

    public Modelo findOne(int id) {
        return repositorio.findById(id);
    }
    public List<Modelo> findAll (){
        return repositorio.findAll();
    }

    public void save(Modelo modelo) {
        repositorio.save(modelo);
    }

    public void delete(int id) {
        repositorio.deleteById(id);
    }


}
