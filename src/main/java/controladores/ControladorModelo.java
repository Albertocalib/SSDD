package controladores;

import modelo.Modelo;
import modelo.ModeloServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashSet;


@Controller
public class ControladorModelo {
    @Autowired
    private ModeloServicio modeloServicio;
    @RequestMapping(value = "/Inicio/crearModelo", method = RequestMethod.POST)
    public String crearModelo(Model model, @RequestParam MultipartFile file, @RequestParam int valorFacial, @RequestParam double peso, @RequestParam double diametro, @RequestParam String metales,@RequestParam String descripcion, @RequestParam String unidadMonetaria) throws IOException {
        Modelo m=new Modelo(valorFacial,unidadMonetaria,diametro,peso,descripcion, "data:image/png;base64,"+ Base64.getEncoder().encodeToString(file.getBytes()));
        LinkedHashSet<String> metalesA=  new LinkedHashSet<>(Arrays.asList(metales.split(",")));
        m.setMetales(metalesA);
        modeloServicio.guardar(m);
        return "Inicio";
    }
}
