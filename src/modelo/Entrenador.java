package modelo;

public class Entrenador {
	private int idEntrenador;
	private Pokemon []equipo;
	private Pokemon []equipoSecundario;
	private String nombre;
	private int pokemonedas;

	public Entrenador() {
		this.pokemonedas = (int) (Math.random() * (1000 - 800 + 1) + 800);
	}
	
	public Entrenador(int idEntrenador, Pokemon []equipo, Pokemon []equipoSecundario, String nombre) {
		this();
		this.idEntrenador = idEntrenador;
		this.equipo = equipo;
		this.equipoSecundario = equipoSecundario;
		this.nombre = nombre;
	}

	public int getIdEntrenador() { return this.idEntrenador; }
	public void setIdEntrenador(int idEntrenador) { this.idEntrenador = idEntrenador; }

	public Pokemon[] getEquipo() { return this.equipo; }
	public void setEquipo(Pokemon []equipo) { this.equipo = equipo; }

	public Pokemon[] getEquipoSecundario() { return this.equipoSecundario; }
	public void setEquipoSecundario(Pokemon []equipoSecundario) { this.equipoSecundario = equipoSecundario; }

	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public int getPokemonedas() { return this.pokemonedas; }
	public void setPokemonedas(int pokemonedas) { this.pokemonedas = pokemonedas; }

	@Override
	public String toString() {
		String equipoStr = "", equipoSecundarioStr = "";

		for(int i=0; i<equipo.length;i++) {
			if(equipo[i] != null) {
				equipoStr += equipo[i] + "\n";
			}
		}

		for(int i=0; i<equipoSecundario.length;i++) {
			if(equipoSecundario[i] != null) {
				equipoSecundarioStr += equipoSecundario[i] + "\n";
			}
		}

		return "nombre: " + getNombre() + "\n" +
			   "id entrenador: " + getIdEntrenador() + "\n" +
			   "Pokemonedas: " + getPokemonedas() + "\n" +
		       "Equipo Principal:\n" + equipoStr + "\n\n" +
			   "Equipo Secundario: \n" + equipoSecundarioStr;
	}
	
	
	public void moverEquipoToSecundario(Pokemon pokemon) {
		if (equipo.length > 1) {
			Pokemon p;

			for (int i=0; i < equipo.length; i++) {
				p = equipo[i];

				if (p.getIdPokemon() == pokemon.getIdPokemon()) {
					equipo[i] = null;

					for (int j=0; j < equipoSecundario.length; j++) {
						if (equipoSecundario[j] == null) {
							equipoSecundario[j] = p;
							break;
						}
					}
				}
			}
		}
	}

	public void moverSecundarioToEquipo(Pokemon pokemon) {
		if(equipoSecundario.length > 0) {
			Pokemon p;

			for (int i=0; i < equipoSecundario.length; i++){
				p = equipoSecundario[i];

					if(p.getIdPokemon() == pokemon.getIdPokemon()) {
						equipoSecundario[i] = null;

						for(int j= 0; j < equipo.length; j++) {
							if (equipo[j] == null) {
								equipo[j] = p;
								break;
						}
					}
				}
			}
		}
	}

    //Introducir método para capturar.

    //Intoducir método para combatir.
	
}