package pokemon;

import pokemon.Pokemon;

public class Test {

    public static void main(String[] args) {
        // Pokemon p = new Pokemon();
        // p.setExperiencia(10);
        // System.out.println(p);
        
        // p.subirNivel();
        // System.out.println(p);

        // p.setExperiencia(23);
        // p.subirNivel();
        // System.out.println(p);

        Pokemon p1, p2, p3, p4, p5;
        Entrenador e1;

        p1 = new Pokemon(1, "P1", "P1", 1, Tipo.AGUA, Tipo.VOLADOR, Estado.SIN_ESTADO, 20);
        p2 = new Pokemon(2, "P2", "P2", 2, Tipo.BICHO, Tipo.TIERRA, Estado.SIN_ESTADO, 30);
        p3 = new Pokemon(3, "P3", "P3", 3, Tipo.ELECTRICO, Tipo.AGUA, Estado.SIN_ESTADO, 40);
        p4 = new Pokemon(4, "P4", "P4", 4, Tipo.FUEGO, null, Estado.SIN_ESTADO, 30);
        p5 = new Pokemon(5, "P5", "P5", 5, Tipo.PLANTA, null, Estado.SIN_ESTADO, 50);

        Pokemon []equipo = {p1, p3, p4};
        Pokemon []secundario = new Pokemon[100];
        secundario[0] = p2;

        e1 = new Entrenador(1, equipo, secundario, "Pepema");
        
        System.out.println(e1);

        e1.moverSecundarioToEquipo(p2);
        System.out.println(e1);

        

        

    }
    
}
