package pokemon;

public class MovimientoMejora extends Movimiento{
    
    private Mejora mejora;
    private int cantidadMejora;
    private int numeroTurnos;

    public MovimientoMejora() { super (); }


    public MovimientoMejora(int idMovimiento, String nombre, Mejora mejora, int cantidadMejora, int numeroTurnos) {
        super(idMovimiento, nombre);
        this.mejora = mejora;
        this.cantidadMejora = cantidadMejora;
        this.numeroTurnos = numeroTurnos;
    }
    

    public Mejora getMejora() { return this.mejora; }
    public void setMejora(Mejora mejora) { this.mejora = mejora; }

    public int getCantidadMejora() { return this.cantidadMejora; }
    public void setCantidadMejora(int cantidadMejora) { this.cantidadMejora = cantidadMejora; }

    public int getNumeroTurnos() { return this.numeroTurnos; }
    public void setNumeroTurnos(int numeroTurnos) { this.numeroTurnos = numeroTurnos; }


    @Override
    public String toString() {
        return super.toString() + "{" +
            " mejora='" + getMejora() + "'" +
            ", cantidadMejora='" + getCantidadMejora() + "'" +
            ", numeroTurnos='" + getNumeroTurnos() + "'" +
            "}";
    }

    public void consumirEstamina(Pokemon pokemon) {
        pokemon.setEstamina(pokemon.getEstamina() - numeroTurnos * 10);
    }
}
