package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta", nullable = false)
    private Integer id;

    @Column(name = "fecha_consulta", nullable = false)
    private LocalDateTime fecha;

    @OneToOne
    @JoinColumn(name = "id_enfermero", nullable = false)
    private Enfermero enfermero;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
