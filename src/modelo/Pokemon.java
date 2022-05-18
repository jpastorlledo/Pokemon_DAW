package modelo;

public class Pokemon {
    private int idPokemon;
    private String nombre;
    private String mote;
    private int vitalidad;
    private double ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private double estamina;
    private int nivel;
    private int fertlidad;
    private Tipo tipo1;
    private Tipo tipo2;
    private Estado estado;
    private int experiencia;
    Movimiento []movimientosPosibles;
    Movimiento []movimientosDisponibles;
    
    public Pokemon() {
        this.vitalidad = numeroAleatorio(10);
        this.ataque = numeroAleatorio(10);
        this.defensa = numeroAleatorio(10);
        this.ataqueEspecial = numeroAleatorio(10);
        this.defensaEspecial = numeroAleatorio(10);
        this.velocidad = numeroAleatorio(10);
        this.movimientosPosibles = new Movimiento[4];
        this.movimientosDisponibles = new Movimiento[4];
        this.nivel = 1;
        this.fertlidad = 5;
    }

    public Pokemon(int idPokemon, String nombre, String mote, int nivel, Tipo tipo1, Tipo tipo2, Estado estado, double estamina) {
        this();
        this.idPokemon = idPokemon;
        this.nombre = nombre;
        this.mote = mote;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.estado = estado;
        this.nivel = nivel;
        this.estamina = estamina;
    }
    
    public int getIdPokemon() { return idPokemon; }
    public void setIdPokemon(int idPokemon) { this.idPokemon = idPokemon; }

    public String getNombre() { return nombre; }
    public void setNombre( String nombre) { this.nombre = nombre; }

    public String getMote() { return mote; }
    public void setMote(String mote) { this.mote = mote; }

    public int getVitalidad() { return vitalidad; }
    public void setVitalidad(int vitalidad) { this.vitalidad = (vitalidad<0)?0:vitalidad; }

    public double getAtaque() { return ataque; }
    public void setAtaque(double ataque) { this.ataque = ataque;}

    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }

    public int getAtaqueEspecial() { return ataqueEspecial; }
    public void setAtaqueEspecial(int ataqueEspecial) { this.ataqueEspecial = ataqueEspecial; }

    public int getDefensaEspecial() { return defensaEspecial; }
    public void setDefensaEspecial(int defensaEspecial) { this.defensaEspecial = defensaEspecial; }

    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }

    public double getEstamina() { return estamina; }
    public void setEstamina(double estamina) { this.estamina = (estamina<0)?0:estamina; }

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

    public int getExperiencia() { return this.experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public Movimiento[] getMovimientosDisponibles() { return this.movimientosDisponibles; }
    public void setMovimientosDisponibles(Movimiento[] movimiento) { this.movimientosDisponibles = movimiento; }

    public Movimiento[] getMovimientosPosibles() { return this.movimientosPosibles; }
    public void setMovimientosPosibles(Movimiento[] movimiento) { this.movimientosPosibles = movimiento; }

    @Override
    public String toString() {
        return "\t" +
            "idPokemon: " + getIdPokemon() +
            ", nombre= " + getNombre() +
            ", mote= " + getMote() +
            ", vitalidad= " + getVitalidad() +
            ", ataque= " + getAtaque() +
            ", defensa= " + getDefensa() +
            ", ataqueEspecial= " + getAtaqueEspecial() +
            ", defensaEspecial= " + getDefensaEspecial() +
            ", velocidad= " + getVelocidad() +
            ", estamina= " + getEstamina() +
            ", nivel= " + getNivel() +
            ", fertlidad= " + getFertilidad() +
            ", tipo1= " + getTipo1() +
            ", tipo2= " + getTipo2() +
            ", estado= " + getEstado() +
            ", experiencia= " + getExperiencia() +
            ", movimientos disponibles= " + getMovimientosDisponibles() +
            ", movimientos posibles= " + getMovimientosPosibles();
    }

    private int numeroAleatorio(int num) {
        return (int) (Math.random() * num) + 1;
    }

    private void aprenderAtaque() {
        if (nivel % 3 == 0) {
            // Por hacer
        }
    }

    public void subirNivel() {
      
        if (experiencia >= 10 * nivel) {
            experiencia -= (10 * nivel);
            nivel++;

            vitalidad += numeroAleatorio(5);
            ataque += numeroAleatorio(5);
            defensa += numeroAleatorio(5);
            ataqueEspecial += numeroAleatorio(5);
            defensaEspecial += numeroAleatorio(5);
            velocidad += numeroAleatorio(5);
        
            aprenderAtaque();
        }
    }
    
        //Incluir método atacar.

    public String comprobarVentajaDesventaja(Pokemon pokemonRival, double nuevaPotencia){
        final String VENTAJA = "VENTAJA";
        final String DESVENTAJA = "DESVENTAJA";
        final String NEUTRO = "NEUTRO";

        if ((this.tipo1 == Tipo.AGUA || this.tipo2 == Tipo.AGUA) &&
                ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) ||
                    (pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.FUEGO || this.tipo2 == Tipo.FUEGO) &&
                ((pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA) ||
                    (pokemonRival.tipo1 == Tipo.BICHO || pokemonRival.tipo2 == Tipo.BICHO))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.PLANTA || this.tipo2 == Tipo.PLANTA) &&
                ((pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA) ||
                    (pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.BICHO || this.tipo2 == Tipo.BICHO) &&
            ((pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA) ||
                (pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.VOLADOR || this.tipo2 == Tipo.VOLADOR) &&
            ((pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA) ||
                (pokemonRival.tipo1 == Tipo.BICHO || pokemonRival.tipo2 == Tipo.BICHO))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.ELECTRICO || this.tipo2 == Tipo.ELECTRICO) &&
            ((pokemonRival.tipo1 == Tipo.VOLADOR || pokemonRival.tipo2 == Tipo.VOLADOR) ||
                (pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if((this.tipo1 == Tipo.TIERRA || this.tipo2 == Tipo.TIERRA) &&
            ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) ||
                (pokemonRival.tipo1 == Tipo.ELECTRICO || pokemonRival.tipo2 == Tipo.ELECTRICO))){
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        }

        if ((this.tipo1 == Tipo.AGUA || this.tipo2 == Tipo.AGUA) &&
            ((pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA) ||
                (pokemonRival.tipo1 == Tipo.ELECTRICO || pokemonRival.tipo2 == Tipo.ELECTRICO))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.FUEGO || this.tipo2 == Tipo.FUEGO) &&
                ((pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA) ||
                    (pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.PLANTA || this.tipo2 == Tipo.PLANTA) &&
                ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) ||
                    (pokemonRival.tipo1 == Tipo.BICHO || pokemonRival.tipo2 == Tipo.BICHO))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.BICHO || this.tipo2 == Tipo.BICHO) &&
                ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) ||
                    (pokemonRival.tipo1 == Tipo.VOLADOR || pokemonRival.tipo2 == Tipo.VOLADOR))) {
            // nuevaPotencia = ataque * 0.5;
            // ataque = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.VOLADOR || this.tipo2 == Tipo.VOLADOR) &&
            ((pokemonRival.tipo1 == Tipo.ELECTRICO || pokemonRival.tipo2 == Tipo.ELECTRICO) ||
                (pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.ELECTRICO || this.tipo2 == Tipo.ELECTRICO) &&
            ((pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA) ||
                (pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if((this.tipo1 == Tipo.TIERRA || this.tipo2 == Tipo.TIERRA) &&
                ((pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA) ||
                    (pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        }

        // if((this.tipo1 == pokemonRival.tipo1) || (this.tipo1 == pokemonRival.tipo2) || (this.tipo2 == pokemonRival.tipo1) || (this.tipo2 == pokemonRival.tipo2)){
        //     nuevaPotencia = MovimientoAtaque.potencia * 1.5;
        //     // MovimientoAtaque.potencia = nuevaPotencia;
        //     return VENTAJA ;
        // }
        
        return NEUTRO;
    }

       

        public void descansar(){}

        //Introducir método aprender ataque 
}
