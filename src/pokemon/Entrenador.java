public class Clase_entrenador {
	private int id_entrenador;
	private Pokemon equipo;
	private Pokemon equipoSecundario;
	private String nombre;
	private int pokemonedas;
	
	public Clase_entrenador(int id_entrenador, Pokemon equipo, Pokemon equipoSecundario, String nombre,
			int pokemonedas) {
		super();
		this.id_entrenador = id_entrenador;
		this.equipo = equipo;
		this.equipoSecundario = equipoSecundario;
		this.nombre = nombre;
		this.pokemonedas = pokemonedas;
	}

	public int getId_entrenador() {
		return id_entrenador;
	}

	public void setId_entrenador(int id_entrenador) {
		this.id_entrenador = id_entrenador;
	}

	public Pokemon getEquipo() {
		return equipo;
	}

	public void setEquipo(Pokemon equipo) {
		this.equipo = equipo;
	}

	public Pokemon getEquipoSecundario() {
		return equipoSecundario;
	}

	public void setEquipoSecundario(Pokemon equipoSecundario) {
		this.equipoSecundario = equipoSecundario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPokemonedas() {
		return pokemonedas;
	}

	public void setPokemonedas(int pokemonedas) {
		this.pokemonedas = pokemonedas;
	}

	@Override
	public String toString() {
		return "Clase_entrenador [id_entrenador=" + id_entrenador + ", equipo=" + equipo + ", equipoSecundario="
				+ equipoSecundario + ", nombre=" + nombre + ", pokemonedas=" + pokemonedas + ", getId_entrenador()="
				+ getId_entrenador() + ", getEquipo()=" + getEquipo() + ", getEquipoSecundario()="
				+ getEquipoSecundario() + ", getNombre()=" + getNombre() + ", getPokemonedas()=" + getPokemonedas()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}