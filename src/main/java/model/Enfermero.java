package model;

import jakarta.persistence.*;

@Entity
@Table(name = "enfermero")
@PrimaryKeyJoinColumn(name="id")
@DiscriminatorValue(value="3")
public class Enfermero extends Persona{
    @Column(name = "consulta", nullable = false)
    private String consulta;
    @Column(name = "turno", nullable = false)
    private String turno;

    public Enfermero() {
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
