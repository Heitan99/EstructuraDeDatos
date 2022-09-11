package campeonato;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        System.out.println("INGRESE DATOS DEL JUGADOR");

        String nombreCompleto,apellidos,ci;
        int edad,i,nJugadores = 2;

        jugador[] jugadores = new jugador[nJugadores];

        for (i = 0; i < nJugadores; i= i +1) {
            System.out.println("Ingrese nombre del jugador "+(i + 1)+ ": ");
            nombreCompleto = leer.next();
            System.out.println("Ingrese apellido del jugador "+(i + 1)+ ": ");
            apellidos = leer.next();
            System.out.println("Ingrese CI del jugador "+(i + 1)+ ": ");
            ci = leer.next();
            System.out.println("\nIngrese Edad del jugador "+(i + 1)+ ": ");
            edad = leer.nextInt();

            jugador jug1 = new jugador();
            jug1.setNombrecompleto(nombreCompleto);
            jug1.setApellido(apellidos);
            jug1.setCi(ci);
            jug1.setEdad(edad);
            jug1.mostrarJugador();

            jugadores[1] = jug1;
        }

        equipo equ1 = new equipo("Always Ready", "Varones", jugadores);
        equ1.mostrarEquipo();




    }
}
