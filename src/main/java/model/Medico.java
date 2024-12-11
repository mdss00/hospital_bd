package model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
@DiscriminatorValue(value = "1")
public class Medico extends Persona{

    @Column(name = "consulta", nullable = false)
    private String consulta;

    @Column(name = "consulta", nullable = false)
    private List<Accion> historico;
}
