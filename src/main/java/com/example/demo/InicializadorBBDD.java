package com.example.demo;

import javax.annotation.PostConstruct;

import com.example.demo.ejemplar.Ejemplar;
import com.example.demo.ejemplar.EjemplarRepositorio;
import com.example.demo.modelo.Modelo;
import com.example.demo.modelo.ModeloRepositorio;
import com.example.demo.proveedor.Proveedor;
import com.example.demo.proveedor.ProveedorRepositorio;
import org.apache.commons.io.IOUtils;
import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Base64;


@Component
public class InicializadorBBDD {

	@Autowired
	private ModeloRepositorio modeloRepositorio;
	@Autowired
	private EjemplarRepositorio ejemplarRepositorio;
	@Autowired
	private ProveedorRepositorio proveedorRepositorio;

	@PostConstruct
	public void init() throws IOException {
		Modelo modelo = new Modelo(1,"Doblón Español",2.5,6.77,"Doblón de oro español","/img/ejemplo.png");
		modelo.addMetal("oro");
		Modelo modelo2 = new Modelo(5,"Doblón Español",2.5,6.77,"Doblón de oro español","/img/ejemplo.png");
		modelo.addMetal("oro");
		Proveedor proveedor = new Proveedor("05200","Samuel","arevalo","sss@gmail.com",685270766);
		Date date = new Date(1998,6,13);
		Ejemplar ejemplar = new Ejemplar(date,"mostoles",2005,"Corroido");
		ejemplar.addImagen("/img/ejemplo.png");
		modeloRepositorio.save(modelo);
		proveedorRepositorio.save(proveedor);
		modelo.addEjemplar(ejemplar);
		proveedor.addEjemplar(ejemplar);
		ejemplar.setModelo(modelo);
		ejemplar.setProveedor(proveedor);
		ejemplarRepositorio.save(ejemplar);




	}
}
