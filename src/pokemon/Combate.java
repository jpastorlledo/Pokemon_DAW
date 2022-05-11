package pokemon;

public class Combate {
    
    private Entrenador jugador;
    private Entrenador rival;
    private Entrenador ganador;
    private Turno numeroTurno;
    private Pokemon pokemonKoJugador;
    private Pokemon pokemonKoRival;

    public Combate(){}

    public Combate(Entrenador jugador, Entrenador rival, Entrenador ganador, Turno numeroTurno, Pokemon pokemonKoJugador, Pokemon pokemonKoRival) {
        this.jugador = jugador;
        this.rival = rival;
        this.ganador = ganador;
        this.numeroTurno = numeroTurno;
        this.pokemonKoJugador = pokemonKoJugador;
        this.pokemonKoRival = pokemonKoRival;
    }
    

    public Entrenador getJugador() { return this.jugador; }
    public void setJugador(Entrenador jugador) { this.jugador = jugador; }

    public Entrenador getRival() { return this.rival; }
    public void setRival(Entrenador rival) { this.rival = rival; }

    public Entrenador getGanador() { return this.ganador; }
    public void setGanador(Entrenador ganador) { this.ganador = ganador; }

    public Turno getNumeroTurno() { return this.numeroTurno; }
    public void setNumeroTurno(Turno numeroTurno) { this.numeroTurno = numeroTurno; }

    public Pokemon getPokemonKoJugador() { return this.pokemonKoJugador; }
    public void setPokemonKoJugador(Pokemon pokemonKoJugador) { this.pokemonKoJugador = pokemonKoJugador; }

    public Pokemon getPokemonKoRival() { return this.pokemonKoRival; }
    public void setPokemonKoRival(Pokemon pokemonKoRival) { this.pokemonKoRival = pokemonKoRival; }


    @Override
    public String toString() {
        return "{" +
            " jugador='" + getJugador() + "'" +
            ", rival='" + getRival() + "'" +
            ", ganador='" + getGanador() + "'" +
            ", numeroTurno='" + getNumeroTurno() + "'" +
            ", pokemonKoJugador='" + getPokemonKoJugador() + "'" +
            ", pokemonKoRival='" + getPokemonKoRival() + "'" +
            "}";
    }

    public void obtenerExperiencia(int experienciaObtenida, Pokemon pokemonJugador, Pokemon pokemonRival){
         
        experienciaObtenida = ((pokemonJugador.getNivel() + pokemonRival.getNivel())*10)/4;
    }

    //Introducir método para generar pokemon aleatorio.

    //Introducir métodos para obtener niveles.

    //Itroducir método para finalizar combate.

    //Introducir método para retirarse.

    //Introducir método para entregar pokemonedas.

    
}
