package pokemon;

public class Pokemon {
    
    private int idPokemon;
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private int estamina;
    private int nivel;
    private int fertlidad;
    private Tipo tipo1;
    private Tipo tipo2;
    private Estado estado;

    public Pokemon() {}


    public Pokemon(int idPokemon, String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad, int estamina, int nivel, int fertlidad, Tipo tipo1, Tipo tipo2, Estado estado) {
        this.idPokemon = idPokemon;
        this.nombre = nombre;
        this.mote = mote;
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.estamina = estamina;
        this.nivel = nivel;
        this.fertlidad = fertlidad;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.estado = estado;
    }
    
    public int getIdPokemon() { return idPokemon; }
    public void setIdPokemon(int idPokemon) { this.idPokemon = idPokemon; }

    public String getNombre() { return nombre; }
    public void setNombre( String nombre) { this.nombre = nombre; }

    public String getMote() { return mote; }
    public void setMote(String mote) { this.mote = mote; }

    public int getVitalidad() { return vitalidad; }
    public void setVitalidad(int vitalidad) { this.vitalidad = vitalidad; }

    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque;}

    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }

    public int getAtaqueEspecial() { return ataqueEspecial; }
    public void setAtaqueEspecial(int ataqueEspecial) { this.ataqueEspecial = ataqueEspecial; }

    public int getDefensaEspecial() { return defensaEspecial; }
    public void setDefensaEspecial(int defensaEspecial) { this.defensaEspecial = defensaEspecial; }

    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }

    public int getEstamina() { return estamina; }
    public void setEstamina(int estamina) { this.estamina = estamina; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getFertilidad() { return fertlidad; }
    public void setFertilidad(int fertilidad) { this.fertlidad = fertilidad; }

    public Tipo getTipo1() { return tipo1; }
    public void setTipo1(Tipo tipo1) { this.tipo1 = tipo1; }

    public Tipo getTipo2() { return tipo2; }
    public void setTipo2(Tipo tipo2) { this.tipo2 = tipo2; }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }


    @Override
    public String toString() {
        return "{" +
            " idPokemon='" + getIdPokemon() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", mote='" + getMote() + "'" +
            ", vitalidad='" + getVitalidad() + "'" +
            ", ataque='" + getAtaque() + "'" +
            ", defensa='" + getDefensa() + "'" +
            ", ataqueEspecial='" + getAtaqueEspecial() + "'" +
            ", defensaEspecial='" + getDefensaEspecial() + "'" +
            ", velocidad='" + getVelocidad() + "'" +
            ", estamina='" + getEstamina() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", fertlidad='" + getFertilidad() + "'" +
            ", tipo1='" + getTipo1() + "'" +
            ", tipo2='" + getTipo2() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }

    
    


}
