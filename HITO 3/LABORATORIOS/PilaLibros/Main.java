package Libros;

import pilaDeCadena.PilaDeCadenas;

public class Main {
    public static void main(String[] args) {

        Libro lib1 = new Libro ("La odisea","homero",40,20.50,"Novela");
        Libro lib2 = new Libro ("DBA I","Saul",50,20.50,"Base de datos");
        Libro lib3 = new Libro ("DBA II","ANA",60,20.50,"Base de datos II");
        Libro lib4 = new Libro ("La odisea 2","Bart",70,20.50,"Logica");
        Libro lib5 = new Libro ("La odisea 3","lisa",80,20.50,"Analisis");

        PilaDeLibros pilalibros = new PilaDeLibros(10);
        pilalibros.adicionar(lib1);
        pilalibros.adicionar(lib2);
        pilalibros.adicionar(lib3);
        pilalibros.adicionar(lib4);
        pilalibros.adicionar(lib5);

        pilalibros.mostrar();
        LibrosPaginasMayorA50(pilalibros,50);
        cambiaSentido(pilalibros);

    }

    //Determinar cauntos Libros tiene una cantidad de paginas mayor a 50
    public static void LibrosPaginasMayorA50(PilaDeLibros pila, int cantidad)
    {
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro libroeliminado = null;
        int mayores = 0;

        while (!pila.esVacio())
        {
            libroeliminado = pila.eliminar();

            if (libroeliminado.getNroPag() > cantidad)
            {
                mayores = mayores + 1;
            }
            aux.adicionar(libroeliminado);
        }
        pila.vaciar(aux);
        System.out.println("Cantidad mayor a 50 es: " + mayores);
    }

    public static void cambiaSentido(PilaDeLibros pila){
        PilaDeLibros aux= new PilaDeLibros(10);
        Libro ultimoLibroEliminado = pila.eliminar();
        Libro libroEliminado = null;
        Libro primerLibroEliminado = null;

        while(!pila.esVacio()){
            libroEliminado=pila.eliminar();
            aux.adicionar(libroEliminado);
        }

        primerLibroEliminado = aux.eliminar();
        aux.adicionar(ultimoLibroEliminado);
        pila.vaciar(aux);
        pila.adicionar(primerLibroEliminado);
        pila.mostrar();
    }
}
