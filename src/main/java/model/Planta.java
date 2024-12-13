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
    @Column(name = "enfermeros" , nullable = false)
    private List<Enfermero> enfermeros;

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
}
