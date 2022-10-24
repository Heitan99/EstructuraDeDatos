package PilaDeClientes;

public class Cliente
{
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private String genero;

    public Cliente(String nombre, String apellido, String direccion, int edad, String genero)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public int getEdad()
    {
        return edad;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public void mostrarDatos()
    {
        System.out.println("\nDatos del cliente: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
    }

}
