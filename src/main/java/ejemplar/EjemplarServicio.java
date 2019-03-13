package ejemplar;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EjemplarServicio {
    @Autowired
    private EjemplarRepositorio repositorio;

    public void borrar(int id) {
        repositorio.deleteById(id);
    }
    public Ejemplar buscarPorId(int id){
       return repositorio.findById(id);
    }
    public void borrar(Ejemplar e) {
        repositorio.delete(e);
    }
    public void guardar(Ejemplar ejemplar) {
        repositorio.save(ejemplar);
    }
    public List<Ejemplar> buscarTodos() {
        return repositorio.findAll();
    }

}
