package PilaDeClientes;

public class PilaCliente
{
    private int tope;
    private int max;
    private Cliente[] pilita;

    public PilaCliente(int max)
    {
        this.max = max;
        this.tope = 0;
        this.pilita = new Cliente[this.max+1];

    }
    //tope es la cantidad de elementos que tiene una pila
    //max  es la cantidad maxima que tiene una pila
    public boolean estaVacia()
    {
        if(this.tope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean estaLleno()
    {

        if(this.tope == this.max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int numeroElementos( )
    {
        return this.tope;
    }

    public void insertar(Cliente cliente)
    {
        if(!estaLleno())
        {
            this.tope=this.tope+1;
            this.pilita[this.tope] = cliente;
        }
        else
        {
            System.out.println("La pila esta llena");
        }
    }

    public Cliente eliminar()
    {
        Cliente elementoEliminado= null;
        if(!estaVacia())
        {
            elementoEliminado = this.pilita[this.tope];
            this.tope--;
        }
        else
        {
            System.out.println("La pila esta vacia");
        }
        return elementoEliminado;
    }

    public void mostrar(){
        Cliente elem=null;
        if(estaVacia()){
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Elementos de la pila");
            PilaCliente aux = new PilaCliente(this.max);
            while(!estaVacia()){
                elem = this.eliminar();
                aux.insertar(elem);
                elem.mostrarDatos();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaCliente a){
        while (!a.estaVacia()) {
            insertar(a.eliminar());
        }
    }

}