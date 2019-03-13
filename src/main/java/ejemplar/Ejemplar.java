package ejemplar;

import modelo.Modelo;
import proveedor.Proveedor;

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

    @ManyToOne
    private Modelo modelo;

    @Column(name="Estado")
    private String estado;

    @ManyToOne
    private Proveedor proveedor;

    public Ejemplar(){}

    public Ejemplar(Date fecha_adquisicion, String ciudad_acu, int anyo, Modelo modelo, String estado, Proveedor proveedor) {
        this.fecha_adquisicion = fecha_adquisicion;
        this.ciudad_acu = ciudad_acu;
        this.anyo = anyo;
        this.modelo = modelo;
        this.estado = estado;
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
