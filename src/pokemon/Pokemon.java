package pokemon;

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
    protected static int estamina;
    private int nivel;
    private int fertlidad;
    private Tipo tipo1;
    private Tipo tipo2;
    private Estado estado;
    private int experiencia;
    Movimiento []movimiento = new Movimiento[4];
    
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

    public int getExperiencia() { return this.experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public Movimiento[] getMovimiento() { return this.movimiento; }
    public void setMovimiento(Movimiento[] movimiento) { this.movimiento = movimiento; }


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
            ", experiencia='" + getExperiencia() + "'" +
            ", movimiento='" + getMovimiento() + "'" +
            "}";
    }

   

    public void subirNivel(){
      
        if (experiencia >= 10*nivel){
            experiencia -= (10*nivel);
            nivel++;

            vitalidad =(int) (vitalidad + (Math.random()*5+1));
            ataque =(int) (ataque + (Math.random()*5+1));
            defensa =(int) (defensa + (Math.random()*5+1));
            ataqueEspecial =(int) (Math.random()*5+1);
            defensaEspecial =(int) (Math.random()*5+1);
            velocidad =(int) (Math.random()*5+1);         
        } 
    
        //Aprender movimientos cada 3 niveles.  

    }
    
        //Incluir método atacar.

    public String comprobarVentajaDesventaja(Pokemon pokemonJugador, Pokemon pokemonRival, double nuevaPotencia){
        String ventaja = "Ventaja";
        String desventaja = "Desventaja";
        String neutro = "Neutro";
        if ((pokemonJugador.tipo1 == Tipo.AGUA || pokemonJugador.tipo2 == Tipo.AGUA) && ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) || (pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA))){
            nuevaPotencia = ataque * 2;
            ataque = nuevaPotencia;
            return ventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.FUEGO || pokemonJugador.tipo2 == Tipo.FUEGO) && ((pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA) || (pokemonRival.tipo1 == Tipo.BICHO || pokemonRival.tipo2 == Tipo.BICHO))){
            nuevaPotencia = ataque * 2;
            ataque = nuevaPotencia;
            return ventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.PLANTA || pokemonJugador.tipo2 == Tipo.PLANTA) && ((pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA) || (pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA))){
            nuevaPotencia = ataque * 2;
            ataque = nuevaPotencia;
            return ventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.BICHO || pokemonJugador.tipo2 == Tipo.BICHO) && ((pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA) || (pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA))){
            nuevaPotencia = ataque * 2;
            ataque = nuevaPotencia;
            return ventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.VOLADOR || pokemonJugador.tipo2 == Tipo.VOLADOR) && ((pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA) || (pokemonRival.tipo1 == Tipo.BICHO || pokemonRival.tipo2 == Tipo.BICHO))){
            nuevaPotencia = ataque * 2;
            ataque = nuevaPotencia;
            return ventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.ELECTRICO || pokemonJugador.tipo2 == Tipo.ELECTRICO) && ((pokemonRival.tipo1 == Tipo.VOLADOR || pokemonRival.tipo2 == Tipo.VOLADOR) || (pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA))){
            nuevaPotencia = ataque * 2;
            ataque = nuevaPotencia;
            return ventaja;
        }else if((pokemonJugador.tipo1 == Tipo.TIERRA || pokemonJugador.tipo2 == Tipo.TIERRA) && ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) || (pokemonRival.tipo1 == Tipo.ELECTRICO || pokemonRival.tipo2 == Tipo.ELECTRICO))){
            nuevaPotencia = ataque * 2;
            ataque = nuevaPotencia;
            return ventaja;
        }

        if ((pokemonJugador.tipo1 == Tipo.AGUA || pokemonJugador.tipo2 == Tipo.AGUA) && ((pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA) || (pokemonRival.tipo1 == Tipo.ELECTRICO || pokemonRival.tipo2 == Tipo.ELECTRICO))){
            nuevaPotencia = ataque * 0.5;
            ataque = nuevaPotencia;
            return desventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.FUEGO || pokemonJugador.tipo2 == Tipo.FUEGO) && ((pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA) || (pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA))){
            nuevaPotencia = ataque * 0.5;
            ataque = nuevaPotencia;
            return desventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.PLANTA || pokemonJugador.tipo2 == Tipo.PLANTA) && ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) || (pokemonRival.tipo1 == Tipo.BICHO || pokemonRival.tipo2 == Tipo.BICHO))){
            nuevaPotencia = ataque * 0.5;
            ataque = nuevaPotencia;
            return desventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.BICHO || pokemonJugador.tipo2 == Tipo.BICHO) && ((pokemonRival.tipo1 == Tipo.FUEGO || pokemonRival.tipo2 == Tipo.FUEGO) || (pokemonRival.tipo1 == Tipo.VOLADOR || pokemonRival.tipo2 == Tipo.VOLADOR))){
            nuevaPotencia = ataque * 0.5;
            ataque = nuevaPotencia;
            return desventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.VOLADOR || pokemonJugador.tipo2 == Tipo.VOLADOR) && ((pokemonRival.tipo1 == Tipo.ELECTRICO || pokemonRival.tipo2 == Tipo.ELECTRICO) || (pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA))){
            nuevaPotencia = ataque * 0.5;
            ataque = nuevaPotencia;
            return desventaja;
        }else if ((pokemonJugador.tipo1 == Tipo.ELECTRICO || pokemonJugador.tipo2 == Tipo.ELECTRICO) && ((pokemonRival.tipo1 == Tipo.TIERRA || pokemonRival.tipo2 == Tipo.TIERRA) || (pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA))){
            nuevaPotencia = ataque * 0.5;
            ataque = nuevaPotencia;
            return desventaja;
        }else if((pokemonJugador.tipo1 == Tipo.TIERRA || pokemonJugador.tipo2 == Tipo.TIERRA) && ((pokemonRival.tipo1 == Tipo.AGUA || pokemonRival.tipo2 == Tipo.AGUA) || (pokemonRival.tipo1 == Tipo.PLANTA || pokemonRival.tipo2 == Tipo.PLANTA))){
            nuevaPotencia = ataque * 0.5;
            ataque = nuevaPotencia;
            return desventaja;
        }

        if((pokemonJugador.tipo1 == pokemonRival.tipo1) || (pokemonJugador.tipo1 == pokemonRival.tipo2) || (pokemonJugador.tipo2 == pokemonRival.tipo1) || (pokemonJugador.tipo2 == pokemonRival.tipo2)){
            nuevaPotencia = ataque * 1.5;
            ataque = nuevaPotencia;
            return ventaja ;
        }
        
        return neutro;
    
    }

       

        public void descansar(){}

        //Introducir método aprender ataque 
}
