package ManejoDeColasHito4.ColaNumeros;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(100);
        numeros.insertar(10);
        numeros.insertar(5);
        numeros.insertar(50);
        numeros.insertar(37);
        numeros.insertar(10);
        numeros.insertar(500);

        Numeros numeros2= new Numeros(100);
        numeros2.insertar(11);
        numeros2.insertar(5);
        numeros2.insertar(51);
        numeros2.insertar(37);
        numeros2.insertar(11);
        numeros2.insertar(301);

        //EN CASO DE USAR EL METODO DE ELIMINAR REPETIDOS
//        Numeros numeros = new Numeros(5);
//        numeros.insertar(10);
//        numeros.insertar(5);
//        numeros.insertar(50);
//        numeros.insertar(37);
//        numeros.insertar(10);
//        numeros.insertar(50);

        //numeros.mostrar();
        //numeroMenor(numeros);
        //numeroMayor(numeros);
        //menorValorAlPrincipio(numeros);
        //eliminaRepetidos(numeros);                //metodo empleddo
        intercambiarMayor(numeros,numeros2);

    }

    //obtener el numero menor
    public static int numeroMenor(Numeros numeros) {
        Numeros aux = new Numeros(100);
        int menor = 100;
        int valorExtraidoDeLaPila = 0;
        while (numeros.esVacio() == false) {
            valorExtraidoDeLaPila = numeros.eliminar();
            if (valorExtraidoDeLaPila < menor) {
                menor = valorExtraidoDeLaPila;
            }
            aux.insertar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero menor es: " + menor);
        return menor;               //adicionado para usarse en otro metodo
    }

    //obtener el numero mayor
    public static int numeroMayor(Numeros numeros) {
        Numeros aux = new Numeros(100);
        int mayor = 0;
        int valorExtraidoDeLaPila = 0;
        while (numeros.esVacio() == false) {
            valorExtraidoDeLaPila = numeros.eliminar();
            if (valorExtraidoDeLaPila > mayor) {
                mayor = valorExtraidoDeLaPila;
            }
            aux.insertar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero mayor es: " + mayor);
        return mayor;           //adicionado para usarse en otro metodo
    }

    //menor valor al principio
    public static void menorValorAlPrincipio(Numeros numeros) {
        int menorValor=numeroMenor(numeros);
        int valorEliminado=0;
        Numeros aux = new Numeros(100);
        while (numeros.esVacio() == false) {
            valorEliminado = numeros.eliminar();
            if (menorValor != valorEliminado) {
                aux.insertar(valorEliminado);
            }
        }
        numeros.insertar(menorValor);
        numeros.vaciar(aux);
        numeros.mostrar();
    }

    //MOSTRAR VALORES NO REPETIDOS DE LA COLA
    //METODO CON IF Y UN METODO ADICIONAL
    public static void eliminaRepetidos(Numeros numeros){
        int valorExtraido= 0;
        int numelementos = numeros.nroElementos();
        int i;
        for ( i=1; i<= numelementos;i++){
            valorExtraido = numeros.eliminar();
            //  System.out.println("cola value: "+valorExtraidoDELACola);
            if(!verificarRepetido(valorExtraido, numeros)){
                // si el valor eliminado de la cola aun existe entonces eso valor se repite;
                numeros.insertar(valorExtraido);
            }

        }
        numeros.mostrar();
    }
    public static boolean verificarRepetido(int numeroBuscar, Numeros numeros)
    {     int valorExtraidodelacola;
        int nroElemento= numeros.nroElementos();
        int repetidos=0;
        for( int i=1; i<= nroElemento; i++){
            valorExtraidodelacola =numeros.eliminar();
            if(numeroBuscar == valorExtraidodelacola){
                repetidos=repetidos+1;
            }
            else {
                numeros.insertar(valorExtraidodelacola);
            }
        }
        if (repetidos>0){
            return true;
        }else {
            return false;
        }
    }

    //intercambiar el mayor valor de numeros con el mayor valor de numeros2
    public static void intercambiarMayor(Numeros numeros, Numeros numeros2) {
        int mayorValor = numeroMayor(numeros);
        int mayorValor2 = numeroMayor(numeros2);
        int valorEliminado = 0;
        Numeros aux = new Numeros(100);
        Numeros aux2 = new Numeros(100);
        while (numeros.esVacio() == false) {
            valorEliminado = numeros.eliminar();
            if (mayorValor != valorEliminado) {
                aux.insertar(valorEliminado);
            }
        }
        while (numeros2.esVacio() == false) {
            valorEliminado = numeros2.eliminar();
            if (mayorValor2 != valorEliminado) {
                aux2.insertar(valorEliminado);
            }
        }
        numeros.insertar(mayorValor2);
        numeros2.insertar(mayorValor);
        numeros.vaciar(aux);
        numeros2.vaciar(aux2);
        numeros.mostrar();
        numeros2.mostrar();
    }


}


