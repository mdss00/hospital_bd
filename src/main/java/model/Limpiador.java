package model;


import jakarta.persistence.*;

@Entity
@Table(name = "limpiador")
@PrimaryKeyJoinColumn(name="id")
@DiscriminatorValue(value="4")
public class Limpiador extends Persona{


    @ManyToOne
    @JoinColumn(name = "id_planta", nullable = false)
    private Planta planta;

    @Column(name = "turno", nullable = false)
    private Turnos turno;
    public Limpiador() {
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public Turnos getTurno() {
        return turno;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }
}
