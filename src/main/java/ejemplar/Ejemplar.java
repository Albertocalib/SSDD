package ejemplar;

import modelo.Modelo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "ejemplar")
public class Ejemplar {

    public interface BasicInfo{}
    public interface ObjectLists{}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private int id;
    @Column(name="Fecha_adquisicion")
    private Date fecha_adquisicion;

    @Column(name="Ciudad_acu")
    private String ciudad_acu;

    @Column(name = "anyo")
    private Date anyo;

    @ManyToOne
    private Modelo modelo;

    @Column(name="Estado")
    private String estado;

    @Column(name="proveedor")
    private String proveedor;

    public Ejemplar(){}

    public Ejemplar(Date fecha_adquisicion, String ciudad_acu, Date anyo, Modelo modelo, String estado, String proveedor) {
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

    public Date getAnyo() {
        return anyo;
    }

    public void setAnyo(Date anyo) {
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
