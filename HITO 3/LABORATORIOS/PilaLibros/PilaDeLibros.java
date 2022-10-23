package Libros;

public class PilaDeLibros {
    private int max;
    private int tope;
    private Libro[] libros;


    //----------------------------------------------
    public PilaDeLibros(int max)
    {
        this.tope = 0;
        this.max = max;
        this.libros = new Libro[this.max +1];
    }

    //------------------------------------------------
//Metodos
    public boolean esVacio()
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

    public boolean esllena()
    {
        if(tope == max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int nroElementos()
    {
        return this.tope;
    }

    public void adicionar(Libro nuevolibro)
    {
        if (!this.esllena())
        {
            this.tope = this.tope +1;
            this.libros[this.tope] = nuevolibro;

        }
        else
        {
            System.out.println("La pila de libros esta llena: ");
        }

    }

    public Libro eliminar()
    {

        Libro elementosEliminados = null;

        if (!this.esllena())
        {
            elementosEliminados = this.libros[this.tope];
            this.tope = this.tope -1;
            return elementosEliminados;
        }
        else
        {
            System.out.println("No se puede eliminar una pila vacia.");
        }
        return elementosEliminados;
    }

    public void llenar()
    {


    }

    public void mostrar()
    {
        Libro elem=null;
        if(this.esVacio()){
            System.out.println("Pila vacia no hay ITEMS que mostrar");}

        else{
            System.out.println("\n Mostrando la Pila libros");
            PilaDeLibros aux = new PilaDeLibros(this.max);
            while (!esVacio())
            {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrarLibros();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaDeLibros pila)
    {
        while (!pila.esVacio())
            adicionar(pila.eliminar());
    }

}
