package modelo;

public class MovimientoEstado extends Movimiento {

    private Estado estado;
    private int numeroTurnos;

    public MovimientoEstado() { super(); }

    public MovimientoEstado(int idMovimiento, String nombre, Estado estado, int numTurnos) {
        super(idMovimiento, nombre);
        this.estado = estado;
        this.numeroTurnos = numTurnos;
    }


    public Estado getEstado() { return this.estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    public int getNumTurnos() { return this.numeroTurnos; }
    public void setNumTurnos(int numTurnos) { this.numeroTurnos = numTurnos; }

    @Override
    public String toString() {
        return super.toString() + "{" +
            " estado='" + getEstado() + "'" +
            ", numTurnos='" + getNumTurnos() + "'" +
            "}";
    }

    public void consumirEstamina(Pokemon pokemon) {
        pokemon.setEstamina(pokemon.getEstamina() - numeroTurnos * 10);
    }
}