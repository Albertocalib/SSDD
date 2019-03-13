package Proveedor;

import javax.persistence.*;



@Entity
@Table(name="Proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "CodigoIdFiscal")
    private String codigoIdFiscal;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "DireccionPostal")
    private String dirPostal;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private int telefono;

    public Proveedor(){
    }

    public Proveedor(String codigoIdFiscal, String nombre, String dirPostal, String email, int telefono) {
        this.codigoIdFiscal = codigoIdFiscal;
        this.nombre = nombre;
        this.dirPostal = dirPostal;
        this.email = email;
        this.telefono = telefono;
    }

    //Zona de Sets
    public void setId(int id) {
        this.id = id;
    }

    public void setCodigoIdFiscal(String codigoIdFiscal) {
        this.codigoIdFiscal = codigoIdFiscal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirPostal(String dirPostal) {
        this.dirPostal = dirPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Zona de Gets
    public int getId() {
        return id;
    }

    public String getCodigoIdFiscal() {
        return codigoIdFiscal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirPostal() {
        return dirPostal;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }
}
