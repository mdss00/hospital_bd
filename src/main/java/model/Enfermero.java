package model;

import jakarta.persistence.*;

@Entity
@Table(name = "enfermero")
@PrimaryKeyJoinColumn(name="id")
@DiscriminatorValue(value="3")
public class Enfermero extends Persona{

    @Column(name = "turno", nullable = false)
    private Turnos turno;

    @ManyToOne
    @JoinColumn(name = "id_planta", nullable = false)
    private Planta planta;

    @OneToOne(mappedBy = "enfermero")
    private Consulta consulta;

    public Enfermero() {
    }


    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Turnos getTurno() {
        return turno;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
}
