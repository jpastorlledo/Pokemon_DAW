package pokemon;

public class Entrenador {
	private int idEntrenador;
	private Pokemon equipo;
	private Pokemon equipoSecundario;
	private String nombre;
	private int pokemonedas;

	public Entrenador(){}
	

	public Entrenador(int idEntrenador, Pokemon equipo, Pokemon equipoSecundario, String nombre, int pokemonedas) {
		this.idEntrenador = idEntrenador;
		this.equipo = equipo;
		this.equipoSecundario = equipoSecundario;
		this.nombre = nombre;
		this.pokemonedas = pokemonedas;
	}

	public int getIdEntrenador() { return this.idEntrenador; }
	public void setIdEntrenador(int idEntrenador) { this.idEntrenador = idEntrenador; }

	public Pokemon getEquipo() { return this.equipo; }
	public void setEquipo(Pokemon equipo) { this.equipo = equipo; }

	public Pokemon getEquipoSecundario() { return this.equipoSecundario; }
	public void setEquipoSecundario(Pokemon equipoSecundario) { this.equipoSecundario = equipoSecundario; }

	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public int getPokemonedas() { return this.pokemonedas; }
	public void setPokemonedas(int pokemonedas) { this.pokemonedas = pokemonedas; }

	@Override
	public String toString() {
		return "{" +
			" idEntrenador='" + getIdEntrenador() + "'" +
			", equipo='" + getEquipo() + "'" +
			", equipoSecundario='" + getEquipoSecundario() + "'" +
			", nombre='" + getNombre() + "'" +
			", pokemonedas='" + getPokemonedas() + "'" +
			"}";
	}
	
	
	//Introducir métodos para mover pokemon.

    //Introducir método para capturar.

    //Intoducir método para combatir.
	
}