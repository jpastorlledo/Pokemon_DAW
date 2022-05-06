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

}
