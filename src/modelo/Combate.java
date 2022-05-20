package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
    /**
     * Está compuesto por un listado de turnos, un espacio para qur guarde el fichero, por un jugador, un rival, un ganador, un numero de turno, y el numero de pokemons ko de jugador y de rival.
     * @author Francisco Mateos
     * @author Jose Manuel Pastor 
     */
public class Combate {
    private List<Turno>turnos;
    public static final String PATH= "combate.log";
    private Entrenador jugador;
    private Entrenador rival;
    private Entrenador ganador;
    private Turno numeroTurno;
    private Pokemon pokemonKoJugador;
    private Pokemon pokemonKoRival;
    /**
     * Esto es un método para crear un LinkedList.
     */
    public Combate(){
        turnos = new LinkedList<>();
    } 

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void addTurno(Turno t){
        this.turnos.add(t);

    }

    public void escribirCombate(){
        File fichero = new File(PATH);
        try {
            FileWriter fw = new FileWriter(fichero);
        BufferedWriter bw = new BufferedWriter(fw);


            for (Turno turno : turnos) {
               bw.write("Turno" + turno.getNumeroTurno() + ":\n");
               bw.write("Entrenador: " + turno.getAccionJugador()+ ":\n");
               bw.write("Rival: " + turno.getAccionRival() + ":\n");
            }
            bw.close();

        } catch (IOException e) {      
            e.printStackTrace();
        }
    

    }
    /**
     * Constructor parametrizado de Combate.
     * @param jugador Jugador se entrenta a rival
     * @param rival Es el rival del jugador
     * @param ganador Es el ganador del combate
     * @param numeroTurno Es el numero de turno 
     * @param pokemonKoJugador Son los Pokemon Ko del jugador
     * @param pokemonKoRival Son los Pokemon Ko del rival
     */
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

    /**
     * Este método es para obtener experiencia (En proceso)
     * @param experienciaObtenida Es la experiencia obtenida
     * @param pokemonJugador Es el pokemon del jugador
     * @param pokemonRival Es el pokemon del rival
     */
    public void obtenerExperiencia(int experienciaObtenida, Pokemon pokemonJugador, Pokemon pokemonRival){
         
        experienciaObtenida = ((pokemonJugador.getNivel() + pokemonRival.getNivel())*10)/4;
    }

     /**
      * Este método es para generar un pokemon aleatorio (En proceso)
      * @param pokemonRival Es el pokemon del rival
      * @param pokemonJugador Es el pokemon del jugador
      * @return
      */
    public Pokemon generarPokemonAleatorio(Pokemon pokemonRival, Pokemon pokemonJugador){

        pokemonRival.setNivel(pokemonJugador.getNivel());

        if (pokemonRival.getVitalidad() == 0){
            return pokemonRival;
        }

        return pokemonRival;

    }

   

    

    //Itroducir método para finalizar combate.

    //Introducir método para retirarse.

    //Introducir método para entregar pokemonedas.

    
}
