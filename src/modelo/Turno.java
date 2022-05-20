package modelo;

public class Turno {
    
    private int numeroTurno;
    private String accionJugador;
    private String accionRival;

    public Turno(){}
    
    public Turno(int numeroTurno, String accionJugador, String accionRival) {
        this.numeroTurno = numeroTurno;
        this.accionJugador = accionJugador;
        this.accionRival = accionRival;
    }


    public int getNumeroTurno() { return this.numeroTurno; }
    public void setNumeroTurno(int numeroTurno) { this.numeroTurno = numeroTurno; }

    public String getAccionJugador() { return this.accionJugador; }
    public void setAccionJugador(String accionJugador) { this.accionJugador = accionJugador; }

    public String getAccionRival() { return this.accionRival; }
    public void setAccionRival(String accionRival) { this.accionRival = accionRival; }


    @Override
    public String toString() {
        return "{" +
            " numeroTurno='" + getNumeroTurno() + "'" +
            ", accionJugador='" + getAccionJugador() + "'" +
            ", accionRival='" + getAccionRival() + "'" +
            "}";
    }



}
