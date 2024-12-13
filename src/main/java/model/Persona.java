package model;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_name")
    @SequenceGenerator(name = "sequence_name", sequenceName = "your_sequence_name", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "dni", nullable = false, length = 9)
    protected String dni;

    @Column(name = "nss", nullable = false)
    protected String nss;

    @Column(name = "nombre", nullable = false)
    protected String nombre;

    @Column(name = "direccion", nullable = false)
    protected String direccion;

    @Column(name = "telefono", nullable = false)
    protected String telefono;

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}