package pokemon;

public class MovimientoAtaque extends Movimiento {
    
    private double potencia;
    private Tipo tipoElemento;

    public MovimientoAtaque() { super(); }

    public MovimientoAtaque(int idMovimiento, String nombre, int potencia, Tipo tipoElemento) {
        super(idMovimiento, nombre);
        this.potencia = potencia;
        this.tipoElemento = tipoElemento;
    }


    public double getPotencia() { return this.potencia; }
    public void setPotencia(double potencia) { this.potencia = potencia; }

    public Tipo getTipoElemento() { return this.tipoElemento; }
    public void setTipoElemento(Tipo tipoElemento) { this.tipoElemento = tipoElemento; }
    

    @Override
    public String toString() {
        return super.toString() + "{" +
            " potencia='" + getPotencia() + "'" +
            ", tipoElemento='" + getTipoElemento() + "'" +
            "}";
    }
    
    public void consumirEstamina(Pokemon pokemon) {
        pokemon.setEstamina(pokemon.getEstamina() - potencia / 2);
    }
}
