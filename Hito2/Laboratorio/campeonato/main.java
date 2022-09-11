package campeonato;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        jugador jug1 = new jugador("Carlos","valencia","4567865145",18);
        jugador jug2 = new jugador("Roberto","gonzales","879874544",17);

        jugador[] jugadores = new jugador [2];
        jugadores[0] = jug1;
        jugadores[1] = jug2;

        equipo eq1 = new equipo("Buscando a nemo","Varones",jugadores);
        eq1.mostrarEquipo();



    }

}
