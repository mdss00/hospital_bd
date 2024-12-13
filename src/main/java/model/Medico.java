package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medico")
public class Medico extends Persona{

    @Column(name = "consulta", nullable = false)
    private String consulta;

    @OneToMany(mappedBy = "medico")
    @Column(name = "consulta", nullable = false)
    private List<Operacion> historico;

    public Medico() {
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public List<Operacion> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Operacion> historico) {
        this.historico = historico;
    }
}
