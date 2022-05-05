package pokemon;

public abstract class Movimiento {
    
    private int idMovimiento;
    private String nombre;

    public Movimiento() {}


    public Movimiento(int idMovimiento, String nombre) {
        this.idMovimiento = idMovimiento;
        this.nombre = nombre;
    }
    


    public int getIdMovimiento() { return this.idMovimiento; }
    public void setIdMovimiento(int idMovimiento) { this.idMovimiento = idMovimiento; }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }


    @Override
    public String toString() {
        return "{" +
            " idMovimiento='" + getIdMovimiento() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

    public void consumirEstamina(){}
}
