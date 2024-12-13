package model;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "operacion")
public class Operacion{

    @Id
    @Column(name = "id_op", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_op;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Medico medico;

    public Long getId_op() {
        return id_op;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
