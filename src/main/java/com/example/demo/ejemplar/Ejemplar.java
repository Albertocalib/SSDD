package com.example.demo.ejemplar;

import com.example.demo.modelo.Modelo;
import com.example.demo.proveedor.Proveedor;

import javax.persistence.*;
import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name= "ejemplar")
public class Ejemplar {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private int id;

    @Column(name="FechaAdquisicion")
    private Date fechaAdquisicion;

    @Column(name="Ciudad_acu")
    private String ciudad_acu;

    @Column(name = "anyo")
    private int anyo;

    @Column(name="Estado")
    private String estado;

    @Column(name = "imagenes",columnDefinition="LONGTEXT")
    private LinkedHashSet<String> listaImagenes;

    @ManyToOne
    private Modelo modelo;

    @ManyToOne
    private Proveedor proveedor;

    public Ejemplar(){
        listaImagenes = new LinkedHashSet<>();
    }

    public Ejemplar(Date fechaAdquisicion, String ciudad_acu, int anyo, String estado, Modelo modelo, Proveedor proveedor) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.ciudad_acu = ciudad_acu;
        this.anyo = anyo;
        this.estado = estado;
        this.modelo = modelo;
        this.proveedor = proveedor;
        listaImagenes = new LinkedHashSet<>();
    }

    public Ejemplar(Date fechaAdquisicion, String ciudad_acu, int anyo, String estado) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.ciudad_acu = ciudad_acu;
        this.anyo = anyo;
        this.estado = estado;
        listaImagenes = new LinkedHashSet<>();
    }

    public Set<String> getListaImagenes() {
        return listaImagenes;
    }

    public void setListaImagenes(LinkedHashSet<String> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
    public void addImagen(String img){
        this.listaImagenes.add(img);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getCiudad_acu() {
        return ciudad_acu;
    }

    public void setCiudad_acu(String ciudad_acu) {
        this.ciudad_acu = ciudad_acu;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
