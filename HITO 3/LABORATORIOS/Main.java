public class Main {

    public static void main(String[] args){
        PilaNumeros pila1 = new PilaNumeros(10);
        pila1.adicionar(12);
        pila1.adicionar(4);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(7);
        pila1.adicionar(12);
        pila1.adicionar(100);

        pila1.mostrar();
        muestraNumeroMayor(pila1);
        muestraNumeroMenor(pila1);
        determinarParesImpares(pila1);
        muevePosition(pila1,5);
        muevePosition2(pila1,23);
    }

    //este metodo me permite obtener el mayor de la pila de numeros

    public static void muestraNumeroMayor(PilaNumeros pila){
        PilaNumeros aux =new PilaNumeros(10);
        int mayor =-1;
        int valorExtraidoDeLaPila=0;
        while(pila.esVacio()==false ){
            valorExtraidoDeLaPila=pila.eliminar();
            if (valorExtraidoDeLaPila>mayor){
                mayor=valorExtraidoDeLaPila;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        pila.vaciar(aux);
        System.out.print("El numero mayor es: " + mayor);
    }
    public static void muestraNumeroMenor(PilaNumeros pila){
        PilaNumeros aux =new PilaNumeros(100);
        int menor =100;
        int valorExtraidoDeLaPila=0;
        while(pila.esVacio()==false ){
            valorExtraidoDeLaPila=pila.eliminar();
            if (valorExtraidoDeLaPila<menor){
                menor=valorExtraidoDeLaPila;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        pila.vaciar(aux);
        System.out.println("\nEl numero menor es: " + menor);
    }

    //mostrar numeros pares e impares
    public static void determinarParesImpares(PilaNumeros pila) {
        PilaNumeros aux = new PilaNumeros(10);
        int pares =0;
        int impares=0;
        int ValorExtraidoDeLaPila=0;
        while(pila.esVacio()==false){
            ValorExtraidoDeLaPila=pila.eliminar();
            if(ValorExtraidoDeLaPila%2==0){
                pares=pares+1;
            }else{
                impares=impares+1;
            }
            aux.adicionar(ValorExtraidoDeLaPila);
        }

        pila.vaciar(aux);
        System.out.println("\ncantidad de pares: "+pares);
        System.out.println("cantidad de impares: "+impares);
    }

    public static void muevePosition(PilaNumeros pila,int elemento) {
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidoDeLaPila=0;
        while (pila.esVacio()==false){
            valorExtraidoDeLaPila=pila.eliminar();
            if (valorExtraidoDeLaPila!=elemento) {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(elemento);
        pila.mostrar();
    }

    public static void muevePosition2(PilaNumeros pila,int elemento) {
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidoDeLaPila=0;
        while (pila.esVacio()==false){
            valorExtraidoDeLaPila=pila.eliminar();
            if (valorExtraidoDeLaPila!=elemento) {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila.vaciar(aux);
        aux.adicionar(elemento);
        pila.mostrar();
    }

    }
