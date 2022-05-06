package pokemon;

public class Turno {
    
    private int numeroTurno;
    private Movimiento accionJugador;
    private Movimiento accionRival;

    public Turno(){}
    
    public Turno(int numeroTurno, Movimiento accionJugador, Movimiento accionRival) {
        this.numeroTurno = numeroTurno;
        this.accionJugador = accionJugador;
        this.accionRival = accionRival;
    }


    public int getNumeroTurno() { return this.numeroTurno; }
    public void setNumeroTurno(int numeroTurno) { this.numeroTurno = numeroTurno; }

    public Movimiento getAccionJugador() { return this.accionJugador; }
    public void setAccionJugador(Movimiento accionJugador) { this.accionJugador = accionJugador; }

    public Movimiento getAccionRival() { return this.accionRival; }
    public void setAccionRival(Movimiento accionRival) { this.accionRival = accionRival; }


    @Override
    public String toString() {
        return "{" +
            " numeroTurno='" + getNumeroTurno() + "'" +
            ", accionJugador='" + getAccionJugador() + "'" +
            ", accionRival='" + getAccionRival() + "'" +
            "}";
    }

}
