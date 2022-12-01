package defensa_colas_hito4;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", "Perez", 25, "Peru", "Masculino", "Gold");
        Cliente c2 = new Cliente("Maria", "Gomez", 30, "Bolivia", "Femenino", "Gold");
        Cliente c3 = new Cliente("Pedro", "Lopez", 35, "Bolivia", "Masculino", "Gold");
        Cliente c4 = new Cliente("Luis", "Garcia", 61, "Chile", "Masculino", "Vip");
        Cliente c5 = new Cliente("Ana", "Perez", 55, "Argentina", "Femenino", "Vip");

        ColaDeClientes cola = new ColaDeClientes(10);
        cola.insertar(c1);
        cola.insertar(c2);
        cola.insertar(c3);
        cola.insertar(c4);
        cola.insertar(c5);
        //cola.mostrar();
         convertirACliente(cola);
        //clienteMayor(cola);


    }

    //A todos los clientes que sean de nacionalidad boliviana  y ademas de tipos de cliente gold convertirlos a tipo de cliente a vip
    //es decir si es de bolivia y es gold convertirlo a vip

    public static void convertirACliente(ColaDeClientes cola) {

        while (cola != null) {
            Cliente c = cola.eliminar();
            if (c.getPais().equals("Bolivia") && c.getTipo().equals("Gold")) {
                c.setTipo("Vip");
            }

            cola.mostrar();
            cola.vaciar(cola);
            System.out.println(" Clientes " + c.getNombre() + " " + c.getPais());
        }
    }

    //mover al inicio todos los clientes mayores a 60 años
    //es decir si el cliente es mayor a 60 años debera moverlo al inicio de la cola

    public static void clienteMayor(ColaDeClientes cola) {
        ColaDeClientes aux = new ColaDeClientes(10);
        int mayor = 0;
        Cliente elementoEliminado = null;
        while (!cola.esVacio()) {
            elementoEliminado = cola.eliminar();
            if (elementoEliminado.getEdad() > 60) {
                mayor = elementoEliminado.getEdad();
            }
            aux.insertar(elementoEliminado);
        }
        cola.vaciar(cola);
        cola.mostrar();
        System.out.println("El cliente mayor "+mayor);


    }

    //mayor valor al principio de la cola
    //es decir si el cliente es mayor a 60 años debera moverlo al inicio de la col




}






