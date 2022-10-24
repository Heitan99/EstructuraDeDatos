package PilaDeClientes;

public class Main
{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alejandro", "Quevedo", "Zona 1", 20, "Masculino");
        Cliente cliente2 = new Cliente("Maria", "Diaz", "Zona 2", 28, "Femenino");
        Cliente cliente3 = new Cliente("Mariano", "Gonzales", "Zona 3", 36, "Masculino");
        Cliente cliente4 = new Cliente("Rivers", "Vargas", "Zona 4", 42, "Femenino");
        Cliente cliente5 = new Cliente("Roberto", "Ramos", "Zona 5", 51, "Masculino");


        PilaCliente pila = new PilaCliente(5);
        pila.insertar(cliente1);
        pila.insertar(cliente2);
        pila.insertar(cliente3);
        pila.insertar(cliente4);
        pila.insertar(cliente5);
        //pila.mostrar();
        //mayoresCiertaEdad(pila,20);
        //kEsimoPosicion(pila,cliente3);
        //asignarDireccion(pila,"LaPaz");
        reordenaPila(pila);
    }

    /*12.Determinar cuántos CLIENTES son mayores de 20 años.
        El método deberá llamarse mayoresCiertaEdad(Pila, edadMayor)
        El método debe ser creado en la clase MAIN como un método estático.
        El método recibe 2 parámetros
        -La Pila de Clientes
        -El valor de la edad. */
    public static void mayoresCiertaEdad(PilaCliente pila, int edadMayor){
        int contador = 0;
        Cliente elem = null;
        if(pila.estaVacia()){
            System.out.println("La pila esta vacia");
        } else {
            while(!pila.estaVacia()){
                elem = pila.eliminar();
                if(elem.getEdad() > edadMayor){
                    contador++;
                }
            }
        }
        System.out.println("Clientes Mayor A " + edadMayor +" son: " + contador);
    }

    /*13.Mover el k-ésimo elemento al final de la pila.
       El método deberá llamarse moverElemento(Pila, valorTope)
       El método debe ser creado en la clase MAIN como un método estático.
       El método recibe 2 parámetros
      -La Pila de Clientes
      -El valor de valorTope */

    public static void kEsimoPosicion(PilaCliente pila, Cliente valorTope){
        PilaCliente aux= new PilaCliente(10);
        Cliente elem = null;
        while(!pila.estaVacia()){
            elem = pila.eliminar();
            if(elem  != valorTope){
                aux.insertar(elem);
            }
        }
        pila.vaciar(aux);
        pila.insertar(valorTope);
        pila.mostrar();
    }

/*14.Cambiar la dirección de algunos CLIENTES de la PILA.
  El método deberá llamarse asignarDireccion(Pila, nuevaDireccion)
  El método debe ser creado en la clase MAIN como un método estático.
  El método recibe 2 parámetros
  -La Pila de Clientes
  -La nueva dirección
  Cambiar la dirección del cliente siempre y cuando el género sea FEMENINO.*/

    public static void asignarDireccion(PilaCliente pila, String nuevaDireccion){
        Cliente elem = null;
        if(pila.estaVacia()){
            System.out.println("La pila esta vacia");
        } else {
            while(!pila.estaVacia()){
                elem = pila.eliminar();
                if(elem.getGenero().equals("Femenino")){
                    elem.setDireccion(nuevaDireccion);
                    elem.mostrarDatos();
                }
            }
        }
        pila.mostrar();
    }

/*15.Mover ÍTEMS de la PILA.
 El método deberá llamarse reordenaPila(Pila)
 El método debe ser creado en la clase MAIN como un método estático.
 El método recibe 1 parámetro
 -La Pila de Clientes
 El método debe reordenar la pila de tal manera que los clientes de género FEMENINO queden al final de la pila. */

    public static void reordenaPila(PilaCliente pila){
        PilaCliente aux= new PilaCliente(10);
        Cliente valorExtraidoPila=null;
        while(!pila.estaVacia()){
            valorExtraidoPila = pila.eliminar();
            if(valorExtraidoPila.getGenero().equals("Femenino")){
                valorExtraidoPila.mostrarDatos();}
            else{
                aux.insertar(valorExtraidoPila);
            }

        }
        pila.vaciar(aux);
        pila.mostrar();
    }
}

