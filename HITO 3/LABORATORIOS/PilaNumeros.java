public class PilaNumeros {
    private int max;
    private int[] PilaNums;
    private int tope;

    //----------------------------------------------
    public PilaNumeros(int max)
    {
        this.tope = 0;
        this.max = max;
        PilaNums = new int[this.max +1];
    }

    //------------------------------------------------
//Metodos
    public boolean esVacio()
    {
        if(tope == 0)
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

    public void adicionar(int nuevoItem)
    {
        if (this.esllena() == false)
        {
            this.tope = this.tope +1;
            this.PilaNums[this.tope] = nuevoItem;

        }
        else
        {
            System.out.println("La pila de los numeros esta llena.");
        }

    }

    public int eliminar()
    {

        int elementosEliminados = 0;

        if (this.esllena() == false)
        {
            elementosEliminados = this.PilaNums[this.tope];
            this.tope = this.tope -1;
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
        int elem;
        if(esVacio())
            System.out.println("Pila vacia");
        else{
            System.out.println("\n Datos de la Pila");
            PilaNumeros aux = new PilaNumeros(10);
            while (!esVacio())
            {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println("Elemento: "+ elem);
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaNumeros a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}
