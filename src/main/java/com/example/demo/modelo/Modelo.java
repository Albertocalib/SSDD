package com.example.demo.modelo;

import com.example.demo.ejemplar.Ejemplar;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name= "modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private int id;

    @Column(name = "NombreModelo")
    private String nombreModelo;

    @Column(name = "valorFacial")
    private int valorFacial;

    @Column(name = "unidadMonetaria")
    private String unidadMonetaria;

    @Column(name = "diametro")
    private double diametro;

    @Column(name = "peso")
    private double peso;

    @Column(name="metales")
    private LinkedHashSet<String> metales;

    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "imagen")
    private String imagenCodificada;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "modelo")
    private Set<Ejemplar> listaEjemplares;

    public Modelo() {
        metales=new LinkedHashSet<>();
        listaEjemplares=new LinkedHashSet<>();
    }

    public Modelo(int valorFacial, String unidadMonetaria, double diametro, double peso, String descripcion,String imagen) {
        this.valorFacial = valorFacial;
        this.unidadMonetaria = unidadMonetaria;
        this.diametro = diametro;
        this.peso = peso;
        this.descripcion = descripcion;
        this.imagenCodificada=imagen;
        listaEjemplares=new LinkedHashSet<>();
        metales=new LinkedHashSet<>();

        this.nombreModelo = unidadMonetaria + valorFacial;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValorFacial() {
        return valorFacial;
    }

    public void setValorFacial(int valorFacial) {
        this.valorFacial = valorFacial;
    }

    public String getUnidadMonetaria() {
        return unidadMonetaria;
    }

    public void setUnidadMonetaria(String unidadMonetaria) {
        this.unidadMonetaria = unidadMonetaria;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LinkedHashSet<String> getMetales() {
        return metales;
    }

    public void setMetales(LinkedHashSet<String> metales) {
        this.metales = metales;
    }
    public void addMetal(String metal) {
        this.metales.add(metal);
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LinkedHashSet<Ejemplar> getEjemplares() {
        return (LinkedHashSet<Ejemplar>) listaEjemplares;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.listaEjemplares.add(ejemplar);
    }

    public void setEjemplares(LinkedHashSet<Ejemplar> ejemplares) {
        this.listaEjemplares=ejemplares;
    }



    public String getImagenCodificada() {
        return imagenCodificada;
    }

    public void setImagenCodificada(String imagenCodificada) {
        this.imagenCodificada = imagenCodificada;
    }
}





