package modelo;

import java.util.Random;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;
import javax.sql.*;

/**
 * Clase pokemon, usada para crear diferentes pokemon.
 * @author JOSE MANUEL PASTOR LLEDO
 * @author FRANCISCO MATEOS MARTINEZ
 * 
 */
public class Pokemon {

    /**
     * Esta compuesta por diferentes atributos como el ID de pokemon, el numero de la pokedex,
     * el nombre, el mote, la vitalidad, el ataque, la defensa, el ataque especial,
     * la defensa especial, la velocidad, la estamina, el nivel, la fertilidad,
     * el primer y segundo tipo, la expereincia y los movimientos
     * 
     */
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
    
    /**
     * Constructor vacio de la clase Pokemon.
     */
    
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

    /**
     * Constructor parametrizado de la clase Pokemon.
     * @param idPokemon Identificador del Pokemon.
     * @param nombre Nombre del Pokemon.
     * @param mote Mote del Pokemon.
     * @param nivel Nivel del Pokemon.
     * @param tipo1 Primer tipo del Pokemon.
     * @param tipo2 Segundo del tipo del Pokemon.
     * @param estado Estado en el que se encuentra el pokemon.
     * @param estamina Estamina del pokemon.
     */
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

    /**
     * Metodo para generar un numero aleatorio.
     * @param num Numero para multiplicar con el metodo random.
     * @return Devuelve un numero aleatorio entre 1 y el numero al que equivale el parametro.
     */
    
    private int numeroAleatorio(int num) {
        return (int) (Math.random() * num) + 1;
    }

    /**
     * Declaracion de metodo para aprender ataques.
     */
    private void aprenderAtaque() {
        if (nivel % 3 == 0) {
            // Por hacer
        }
    }

    /**
     * Metodo para subir de nivel un pokemon.
     */

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

        /**
         * Metodo para comprobar si un pokemon tiene ventaja o desventaja con respecto al pokemon rival.
         * @param pokemonRival Pokemon al que nos enfrentamos.
         * @return Devuelve un  mensaja si el pokemon tiene ventaja, desventaja o neutro.
         */

    public String comprobarVentajaDesventaja(Pokemon pokemonRival){
        final String VENTAJA = "VENTAJA";
        final String DESVENTAJA = "DESVENTAJA";
        final String NEUTRO = "NEUTRO";

        if ((this.tipo1 == Tipo.Agua || this.tipo2 == Tipo.Agua) &&
                ((pokemonRival.tipo1 == Tipo.Fuego || pokemonRival.tipo2 == Tipo.Fuego) ||
                    (pokemonRival.tipo1 == Tipo.Tierra || pokemonRival.tipo2 == Tipo.Tierra))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.Fuego || this.tipo2 == Tipo.Fuego) &&
                ((pokemonRival.tipo1 == Tipo.Planta || pokemonRival.tipo2 == Tipo.Planta) ||
                    (pokemonRival.tipo1 == Tipo.Bicho || pokemonRival.tipo2 == Tipo.Bicho))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.Planta || this.tipo2 == Tipo.Planta) &&
                ((pokemonRival.tipo1 == Tipo.Tierra || pokemonRival.tipo2 == Tipo.Tierra) ||
                    (pokemonRival.tipo1 == Tipo.Agua || pokemonRival.tipo2 == Tipo.Agua))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.Bicho || this.tipo2 == Tipo.Bicho) &&
            ((pokemonRival.tipo1 == Tipo.Agua || pokemonRival.tipo2 == Tipo.Agua) ||
                (pokemonRival.tipo1 == Tipo.Planta || pokemonRival.tipo2 == Tipo.Planta))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.Volador || this.tipo2 == Tipo.Volador) &&
            ((pokemonRival.tipo1 == Tipo.Planta || pokemonRival.tipo2 == Tipo.Planta) ||
                (pokemonRival.tipo1 == Tipo.Bicho || pokemonRival.tipo2 == Tipo.Bicho))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if ((this.tipo1 == Tipo.Electrico || this.tipo2 == Tipo.Electrico) &&
            ((pokemonRival.tipo1 == Tipo.Volador || pokemonRival.tipo2 == Tipo.Volador) ||
                (pokemonRival.tipo1 == Tipo.Agua || pokemonRival.tipo2 == Tipo.Agua))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        } else if((this.tipo1 == Tipo.Tierra || this.tipo2 == Tipo.Tierra) &&
            ((pokemonRival.tipo1 == Tipo.Fuego || pokemonRival.tipo2 == Tipo.Fuego) ||
                (pokemonRival.tipo1 == Tipo.Electrico || pokemonRival.tipo2 == Tipo.Electrico))){
            // nuevaPotencia = MovimientoAtaque.potencia * 2;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return VENTAJA;
        }

        if ((this.tipo1 == Tipo.Agua || this.tipo2 == Tipo.Agua) &&
            ((pokemonRival.tipo1 == Tipo.Planta || pokemonRival.tipo2 == Tipo.Planta) ||
                (pokemonRival.tipo1 == Tipo.Electrico || pokemonRival.tipo2 == Tipo.Electrico))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.Fuego || this.tipo2 == Tipo.Fuego) &&
                ((pokemonRival.tipo1 == Tipo.Tierra || pokemonRival.tipo2 == Tipo.Tierra) ||
                    (pokemonRival.tipo1 == Tipo.Agua || pokemonRival.tipo2 == Tipo.Agua))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.Planta || this.tipo2 == Tipo.Planta) &&
                ((pokemonRival.tipo1 == Tipo.Fuego || pokemonRival.tipo2 == Tipo.Fuego) ||
                    (pokemonRival.tipo1 == Tipo.Bicho || pokemonRival.tipo2 == Tipo.Bicho))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.Bicho || this.tipo2 == Tipo.Bicho) &&
                ((pokemonRival.tipo1 == Tipo.Fuego || pokemonRival.tipo2 == Tipo.Fuego) ||
                    (pokemonRival.tipo1 == Tipo.Volador || pokemonRival.tipo2 == Tipo.Volador))) {
            // nuevaPotencia = ataque * 0.5;
            // ataque = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.Volador || this.tipo2 == Tipo.Volador) &&
            ((pokemonRival.tipo1 == Tipo.Electrico || pokemonRival.tipo2 == Tipo.Electrico) ||
                (pokemonRival.tipo1 == Tipo.Tierra || pokemonRival.tipo2 == Tipo.Tierra))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if ((this.tipo1 == Tipo.Electrico || this.tipo2 == Tipo.Electrico) &&
            ((pokemonRival.tipo1 == Tipo.Tierra || pokemonRival.tipo2 == Tipo.Tierra) ||
                (pokemonRival.tipo1 == Tipo.Planta || pokemonRival.tipo2 == Tipo.Planta))) {
            // nuevaPotencia = MovimientoAtaque.potencia * 0.5;
            // MovimientoAtaque.potencia = nuevaPotencia;
            return DESVENTAJA;
        } else if((this.tipo1 == Tipo.Tierra || this.tipo2 == Tipo.Tierra) &&
                ((pokemonRival.tipo1 == Tipo.Agua || pokemonRival.tipo2 == Tipo.Agua) ||
                    (pokemonRival.tipo1 == Tipo.Planta || pokemonRival.tipo2 == Tipo.Planta))) {
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

        /**
         * Metodo para generar un pokemon aleatorio de la base de datos.
         * @param con
         * @throws SQLException
         */
        public void generarPokemonBBDD(Connection con) throws SQLException {
            int numeroRandom= (int) Math.random()*40 + 1 ;		
            String consulta = "SELECT * FROM POKEMON WHERE NUM_POKEDEX=" +numeroRandom;
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            

            while (rs.next()) {
                Random random = new Random();
               
                this.setNumeroPokedex(rs.getInt("NUM_POKEDEX"));
                this.setNombre(rs.getString("NOMBRE"));
                this.setTipo1(Tipo.valueOf(rs.getString("tipo1")));

                if(rs.getObject("tipo2")!=null){
                    this.setTipo2(Tipo.valueOf(rs.getString("tipo2")));
                }else{
                    this.setTipo2(Tipo.NULO);
                    
                }

                this.vitalidad = 1 + random.nextInt(10);
                this.ataque = 1 + random.nextInt(10);
                this.defensa = 1 + random.nextInt(10);
                this.ataqueEspecial = 1 + random.nextInt(10);
                this.defensaEspecial = 1 + random.nextInt(10);
                this.velocidad = 1 + random.nextInt(10);
                this.nivel = 1;
                this.estamina = 30;
                this.fertlidad = 5;

                System.out.println(this.toString());

            statement.close();
            }   
        }

        
        /**
         * Metodo para calcular el mayor Identificador de la base de datos y aumentarlo en 1.
         * @param con
         * @throws SQLException
         */
        public void calcularMayorId(Connection con) throws SQLException {		
            String consulta = "SELECT MAX(ID_POKEMON) FROM POKEMON_ENTRENADOR"; 
            
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                
                this.setIdPokemon(rs.getInt(1)+ 1);
                }
                statement.close();
            }

        /**
         * Metodo para insertar un pokemon en la base de datos al ser capturado.
         * @param con
         * @throws SQLException
         */
        public void insertarPokemon(Connection con) throws SQLException {
            String sentencia ="INSERT INTO POKEMON_ENTRENADOR(ID_POKEMON, NUM_POKEDEX, ID_ENTRENADOR, MOTE, VITALIDAD, ATAQUE, ,ARAQUE_ESP, DEFENSA, DEFENSA_ESP, ESTAMINA, VELOCIDAD, NIVEL, FERTILIDAD) VALUES("
                                                        + this.getIdPokemon()
                                                        +", '"+this.getNumeroPokedex()
                                                        +", '"+this.getMote()
                                                        +", '"+this.getVitalidad()
                                                        +", '"+this.getAtaque()
                                                        +", '"+this.getAtaqueEspecial()
                                                        +", '"+this.getDefensa()
                                                        +", '"+this.getDefensaEspecial()
                                                        +", '"+this.getEstamina()
                                                        +", '"+this.getVelocidad()
                                                        +", '"+this.getNivel()
                                                        +", '"+this.getFertilidad()
                                                        +"')";
            Statement stmt = null;
            try {
            stmt = con.createStatement();
			stmt.executeUpdate(sentencia);
                
                System.out.println("Nuevo pokemon insertado. "+ this.getNombre());
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                stmt.close(); 
            }
                                                           
        }

        /**
         * Metodo para calcular la probabilidad de exito en la captura.
         * @param con
         * @throws SQLException
         */
        public void probabilidadCaptura(Connection con) throws SQLException{
            int numero = 0;

            Random random = new Random();

            numero = 1 + random.nextInt(3);

            if (numero == 1 || numero == 2){
                System.out.println("Captura realizada con éxito");
                calcularMayorId(con);
                insertarPokemon(con);
                
               
            }else{
                System.out.println("Has fallado");
            }

        }    



        //Introducir método aprender ataque 
}
