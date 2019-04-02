package com.example.demo;

import javax.annotation.PostConstruct;

import com.example.demo.ejemplar.Ejemplar;
import com.example.demo.ejemplar.EjemplarRepositorio;
import com.example.demo.modelo.Modelo;
import com.example.demo.modelo.ModeloRepositorio;
import com.example.demo.proveedor.Proveedor;
import com.example.demo.proveedor.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Date;


@Component
public class InicializadorBBDD {

	@Autowired
	private ModeloRepositorio modeloRepositorio;
	@Autowired
	private EjemplarRepositorio ejemplarRepositorio;
	@Autowired
	private ProveedorRepositorio proveedorRepositorio;

	@PostConstruct
	public void init()  {
		Modelo modelo = new Modelo(1,"Doblón Español",2.5,6.77,"Doblón de oro español","/img/ejemploModelo.png");

		modelo.addMetal("oro");

		Proveedor proveedor = new Proveedor("B0000000A", "Calderilla", "Madrid", "cald@gmail.com", 677899034);
		Proveedor proveedor2 = new Proveedor("B0000000H","Samuel","Madrid","sss@gmail.com",685270766);

		Date date = new Date(106, 02, 02);
		Date date2 = new Date(98,02,25);

		Ejemplar ejemplar = new Ejemplar(date, "Valladolid", 1634, "Bien conservado");
		Ejemplar ejemplar2 = new Ejemplar(date2,"Mostoles",1612,"Corroido");

		ejemplar.addImagen("/img/ejemplo1.png");
		ejemplar.addImagen("/img/ejemplo2.png");

		ejemplar2.addImagen("/img/ejemplo3.png");
		ejemplar2.addImagen("/img/ejemplo4.png");

		modeloRepositorio.save(modelo);

		proveedorRepositorio.save(proveedor);
		proveedorRepositorio.save(proveedor2);

		modelo.addEjemplar(ejemplar);
		modelo.addEjemplar(ejemplar2);

		proveedor.addEjemplar(ejemplar);
		proveedor2.addEjemplar(ejemplar2);

		ejemplar.setModelo(modelo);
		ejemplar2.setModelo(modelo);

		ejemplar.setProveedor(proveedor);
		ejemplar2.setProveedor(proveedor2);

		ejemplarRepositorio.save(ejemplar);
		ejemplarRepositorio.save(ejemplar2);




	}
}
