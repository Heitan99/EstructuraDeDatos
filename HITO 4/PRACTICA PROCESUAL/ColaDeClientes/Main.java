package ColaDeClientes;

public class Main {
    public static void main(String[] args) {


        //12.Inicializar la cola de clientes.
        //○ Crear una cola con 5 clientes.
        //■ En la clase MAIN deberán estar los 5 clientes.
        //■ Mostrar todos los datos de la cola de clientes

        Cliente cliente1 = new Cliente("Juan", "Quiroz Rivera", 20, "Masculino", "Bolivia", "Gold");
        Cliente cliente2 = new Cliente("Maria", "De Los Angeles", 15, "Femenino", "Bolivia", "Silver");
        Cliente cliente3 = new Cliente("Saul", "Pereira Contreras", 30, "Masculino", "Argentina", "Gold");
        Cliente cliente4 = new Cliente("Luis", "Camacho Oveda", 70, "Masculino", "Chile", "Vip");
        Cliente cliente5 = new Cliente("Ana", "Lisa Mesta", 25, "Femenino", "Ecuador", "Vip");

        ColaDeClientes cola1 = new ColaDeClientes(5);

        cola1.insertar(cliente1);
        cola1.insertar(cliente2);
        cola1.insertar(cliente3);
        cola1.insertar(cliente4);
        cola1.insertar(cliente5);

        //cola1.mostrar();


                                                                //15.
                                                                //■ Crear 2 colas con 5 clientes.
                                                                //■ En la clase MAIN deberán estar los 5 clientes.
                                                                //■ Mostrar todos los datos de las 2 colas de clientes
                                                                //■ Crear una cola con 10 clientes.


        Cliente cliente6 = new Cliente("Pedro", "Jiminez Condori", 20, "Masculino", "Bolivia", "Gold");
        Cliente cliente7 = new Cliente("Lucia", "Rojas Castillo  ", 15, "Femenino", "Bolivia", "Silver");
        Cliente cliente8 = new Cliente("Carlos", "Castro Contreras", 30, "Masculino", "Argentina", "Gold");
        Cliente cliente9 = new Cliente("Jorge", "Gomez Duarte", 70, "Masculino", "Chile", "Vip");
        Cliente cliente10 = new Cliente("Andrea", "NitaLes Guitierrez", 25, "Femenino", "Peru", "Vip");

        ColaDeClientes cola2 = new ColaDeClientes(5);

        cola2.insertar(cliente6);
        cola2.insertar(cliente7);
        cola2.insertar(cliente8);
        cola2.insertar(cliente9);
        cola2.insertar(cliente10);


        //convertirVIP(cola1, "Bolivia", "Gold");
        //cliente_Mayor(cola1,60);

        mover_Cliente(cola1,cola2);

    }

    //13.Promoción para usuarios de Bolivia.
    //○ En el mes de diciembre a todos los clientes de Bolivia se les dará una promoción
    //en cuanto a precios en viajes a nivel nacional.
    //■ A todos los clientes que sean de nacionalidad boliviana y además el tipo
    //    de cliente GOLD, convertir a estos clientes en VIP
    //■ Es decir si es de Bolivia y es GOLD deberá ser ahora un cliente VIP

    public static void convertirVIP(ColaDeClientes colaCli, String nacionalidad, String tipoCliente) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getPais().equals(nacionalidad) && c.getTipo().equals(tipoCliente)) {
                c.setTipo("VIP");
                colaAux.insertar(c);
            } else {
                colaAux.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        colaCli.mostrar();
    }


    //14.Moviendo clientes en la cola.
    //○ Mover al inicio todos los clientes mayores a 60 años.
    //■ Es decir si el cliente es mayor a 60 deberá de moverlo al inicio de la cola.
    //            ○ El método recibe 2 parámetros
    //■ La Cola de Clientes
    //■ El valor(int) de la edad.

    public static void cliente_Mayor(ColaDeClientes colaCli, int edad) {
        ColaDeClientes colaA1 = new ColaDeClientes(100);
        ColaDeClientes colaA2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getEdad() > edad) {
                colaA1.insertar(c);
            } else {
                colaA2.insertar(c);
            }
        }
        while (!colaA1.esVacio()) {
            colaCli.insertar(colaA1.eliminar());
        }
        while (!colaA2.esVacio()) {
            colaCli.insertar(colaA2.eliminar());
        }
        colaCli.mostrar();
    }



    //15.Moviendo clientes entre 2 colas.
    //○ Por razones de promociones de vuelo, es necesario cambiar de vuelo a ciertos
    //clientes.
    //■ Todos los clientes cuyo nombre sea Saul deberán ser agregados a la
    //cola1 al inicio.

    public static void mover_Cliente(ColaDeClientes colaCli, ColaDeClientes colaCli2) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        ColaDeClientes colaAux2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getNombres().equals("Saul")) {
                colaAux.insertar(c);
            } else {
                colaAux2.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        while (!colaAux2.esVacio()) {
            colaCli.insertar(colaAux2.eliminar());
        }
        colaCli.mostrar();
    }

}
