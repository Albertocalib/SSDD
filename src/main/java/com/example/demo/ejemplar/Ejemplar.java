package com.example.demo.ejemplar;

import com.example.demo.modelo.Modelo;
import com.example.demo.proveedor.Proveedor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "ejemplar")
public class Ejemplar {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private int id;

    @Column(name="Fecha_adquisicion")
    private Date fecha_adquisicion;

    @Column(name="Ciudad_acu")
    private String ciudad_acu;

    @Column(name = "anyo")
    private int anyo;

    @Column(name="Estado")
    private String estado;

    @ManyToOne
    private Modelo modelo;

    @ManyToOne
    private Proveedor proveedor;

    public Ejemplar(){}

    public Ejemplar(Date fecha_adquisicion, String ciudad_acu, int anyo, String estado, Modelo modelo, Proveedor proveedor) {
        this.fecha_adquisicion = fecha_adquisicion;
        this.ciudad_acu = ciudad_acu;
        this.anyo = anyo;
        this.estado = estado;
        this.modelo = modelo;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
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
