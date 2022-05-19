package modelo;

import java.util.Random;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;
import javax.sql.*;

public class Pokemon {
    private int idPokemon;
    private int numeroPokedex;
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
        this.movimientosDisponibles = new Movimiento[20];
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

    public int getNumeroPokedex() { return numeroPokedex; }
    public void setNumeroPokedex(int numeroPokedex) { this.numeroPokedex = numeroPokedex; }

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
            "ID Pokemon: " + getIdPokemon() +
            ", Numero Pokedex= " + getNumeroPokedex() +
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
        
        public Pokemon generarPokemonAleatorio(Pokemon pokemon) {

            Random random = new Random();

            pokemon.vitalidad = 1 + random.nextInt(10);
            pokemon.ataque = 1 + random.nextInt(10);
            pokemon.defensa = 1 + random.nextInt(10);
            pokemon.ataqueEspecial = 1 + random.nextInt(10);
            pokemon.defensaEspecial = 1 + random.nextInt(10);
            pokemon.velocidad = 1 + random.nextInt(10);
            pokemon.nivel = 1;
            pokemon.estamina = 30;
            pokemon.fertlidad = 5;

            return pokemon;

        }

        public static void generarPokemonBBDD(Connection con) throws SQLException {
            int numeroRandom= (int) Math.random()*40 + 1 ;		
            String consulta = "SELECT * FROM POKEMON WHERE NUM_POKEDEX=" +numeroRandom;
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

    
            Pokemon pokemon = null;
            while (rs.next()) {
                pokemon = new Pokemon();
                pokemon.setNumeroPokedex(rs.getInt("NUM_POKEDEX"));
                pokemon.setNombre(rs.getString("NOMBRE"));
                pokemon.setTipo1(Tipo.valueOf(rs.getString("tipo1")));
                pokemon.setTipo2(Tipo.valueOf(rs.getString("tipo2")));
                
                
                System.out.println(pokemon.toString());
            }
            statement.close();
        }

        public static void calcularMayorId(Connection con) throws SQLException {		
            String consulta = "SELECT MAX(ID_POKEMON) FROM POKEMON_ENTRENADOR"; 
            
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

    
            Pokemon pokemon = null;
            while (rs.next()) {
                pokemon = new Pokemon();
                pokemon.setNumeroPokedex(rs.getInt("NUM_POKEDEX"));
                pokemon.setNombre(rs.getString("NOMBRE"));
                pokemon.setTipo1(Tipo.valueOf(rs.getString("tipo1")));
                pokemon.setTipo2(Tipo.valueOf(rs.getString("tipo2")));
                
                
                System.out.println(pokemon.toString());
            }
            statement.close();
        }




        public static void insertarPokemon(Connection con, Pokemon pokemon) throws SQLException {
            String sentencia ="INSERT INTO POKEMON_ENTRENADOR(ID_POKEMON, NUM_POKEDEX, ID_ENTRENADOR, MOTE, VITALIDAD, ATAQUE, ,ARAQUE_ESP, DEFENSA, DEFENSA_ESP, ESTAMINA, VELOCIDAD, NIVEL, FERTILIDAD, EXPERIENCIA) VALUES("
                                                        + pokemon.getIdPokemon()
                                                        +", '"+pokemon.getNumeroPokedex()
                                                        +", '"+pokemon.getMote()
                                                        +", '"+pokemon.getVitalidad()
                                                        +", '"+pokemon.getAtaque()
                                                        +", '"+pokemon.getAtaqueEspecial()
                                                        +", '"+pokemon.getDefensa()
                                                        +", '"+pokemon.getDefensaEspecial()
                                                        +", '"+pokemon.getEstamina()
                                                        +", '"+pokemon.getVelocidad()
                                                        +", '"+pokemon.getNivel()
                                                        +", '"+pokemon.getFertilidad()
                                                        +", '"+pokemon.getExperiencia()
                                                        +"')";
            Statement stmt = null;
            try {
            stmt = con.createStatement();
			stmt.executeUpdate(sentencia);
                
                System.out.println("Nuevo pokemon insertado. "+pokemon.getNombre());
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                stmt.close(); 
            }
                                                           
        }

        //Introducir método aprender ataque 
}
