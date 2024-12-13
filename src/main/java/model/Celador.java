package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "celador")
@PrimaryKeyJoinColumn(name="id")
@DiscriminatorValue(value="2")
public class Celador extends Persona{

    private String turno;

    public Celador() {
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
}
