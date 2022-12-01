package ColaDeClientes;

public class Cliente {

    private String nombres;
    private String apellidos;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;

    public Cliente(String nombres, String apellidos, int edad, String genero, String pais, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
        this.tipo = tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void muestra_Cliente() {
        System.out.println("************* Datos del cliente *************");
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
        System.out.println("Pais: " + this.pais);
        System.out.println("Tipo: " + this.tipo);
    }


}
