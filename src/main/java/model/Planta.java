package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "planta")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planta" , nullable = false)
    private String id_planta;

    @Column(name = "num_planta" , nullable = false)
    private Integer num_planta;

    @OneToMany(mappedBy = "planta")
    @Column(name = "enfermeros" , nullable = true)
    private List<Enfermero> enfermeros;

    @OneToMany(mappedBy = "planta")
    @Column(name = "limpiadores" , nullable = true)
    private List<Limpiador> limpiadores;


    public List<Limpiador> getLimpiadores() {
        return limpiadores;
    }

    public void setLimpiadores(List<Limpiador> limpiadores) {
        this.limpiadores = limpiadores;
    }

    public String getId_planta() {
        return id_planta;
    }

    public void setId_planta(String id_planta) {
        this.id_planta = id_planta;
    }

    public Integer getNum_planta() {
        return num_planta;
    }

    public void setNum_planta(Integer num_planta) {
        this.num_planta = num_planta;
    }

    public List<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(List<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }
}
