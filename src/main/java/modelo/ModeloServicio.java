package modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloServicio {
    @Autowired
    private ModeloRepositorio repositorio;

    public Modelo buscarPorId(int id) {
        return repositorio.findById(id);
    }
    public List<Modelo> buscarTodos (){
        return repositorio.findAll();
    }

    public void guardar(Modelo modelo) {
        repositorio.save(modelo);
    }

    public void borrar(int id) {
        repositorio.deleteById(id);
    }


}
