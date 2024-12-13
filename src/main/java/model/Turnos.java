package model;


public enum Turnos {

    MANANA ("mañana"), TARDE ("tarde"), NOCHE ("noche");

    private String turno;

    Turnos(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
