package com.example.demo;

import javax.annotation.PostConstruct;

import com.example.demo.modelo.Modelo;
import com.example.demo.modelo.ModeloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class InicializadorBBDD {

	@Autowired
	private ModeloRepositorio modeloRepositorio;


	@PostConstruct
	public void init() {
		Modelo modelo = new Modelo(1,"Doblón Español",2.5,6.77,"Doblón de oro español","");
		modelo.addMetal("oro");
		modeloRepositorio.save(modelo);
	}


}
