package pokemon;

public class MovimientoAtaque extends Movimiento{
    
    private int potencia;
    private Tipo tipoElemento;

    public MovimientoAtaque(){ super(); }


    public MovimientoAtaque(int idMovimiento, String nombre, int potencia, Tipo tipoElemento) {
        super(idMovimiento, nombre);
        this.potencia = potencia;
        this.tipoElemento = tipoElemento;
    }


    public int getPotencia() { return this.potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }

    public Tipo getTipoElemento() { return this.tipoElemento; }
    public void setTipoElemento(Tipo tipoElemento) { this.tipoElemento = tipoElemento; }
    

    @Override
    public String toString() {
        return super.toString() + "{" +
            " potencia='" + getPotencia() + "'" +
            ", tipoElemento='" + getTipoElemento() + "'" +
            "}";
    }

    public void consumirEstamina() {
        
    }
}
