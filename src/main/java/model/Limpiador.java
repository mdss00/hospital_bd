package model;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "4")
public class Limpiador extends Persona{
    @Column(name = "planta", nullable = false)
    private String planta;
    @Column(name = "turno", nullable = false)
    private String turno;
    public Limpiador() {
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
