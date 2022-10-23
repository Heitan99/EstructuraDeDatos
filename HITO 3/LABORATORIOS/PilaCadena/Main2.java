package pilaDeCadena;

public class Main2 {
    public static void main(String[] args) {
        PilaDeCadenas nombresEDD= new PilaDeCadenas(10);

        nombresEDD.adicionar("William");
        nombresEDD.adicionar("Andres");
        nombresEDD.adicionar("Josias");
        nombresEDD.adicionar("Iris");
        nombresEDD.adicionar("Jonathan");
        nombresEDD.adicionar("Ilia");
        nombresEDD.adicionar("Andres");

        nombresEDD.mostrar();
        determinaUsuarioPorNombre(nombresEDD,"Andres");
        agregaAlInicio(nombresEDD,"Ilia");

    }

    //crear un metodo en la clase main que permita ver cuantos nombres son iguales a andres
    String nombre="Andres";
    public static void determinaUsuarioPorNombre(PilaDeCadenas nombresEDD, String nombre) {
        PilaDeCadenas aux= new PilaDeCadenas(10);
        String valorDePila="";
        int cantidad=0;

        while(nombresEDD.esVacio()==false) {
            valorDePila=nombresEDD.eliminar();
            if(valorDePila==nombre){
                cantidad= cantidad+1;
            }
            aux.adicionar(valorDePila);
        }
        nombresEDD.vaciar(aux);
        System.out.println("Cantidad "+cantidad);
    }

    public static void agregaAlInicio(PilaDeCadenas nombresEDD,String nombre){
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorDePila = "";
        while(nombresEDD.esVacio()== false){
            valorDePila=nombresEDD.eliminar();
            aux.adicionar(valorDePila);
        }
        aux.adicionar(nombre);
        nombresEDD.vaciar(aux);
        nombresEDD.mostrar();
    }

    public static void modificarKesimo(){

    }

}
