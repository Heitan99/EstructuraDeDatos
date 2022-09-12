package Pais;

public class Pais {
    private String nombre;
    private int nroDepartamentos;

    private Departamento[] departamentos1;

    public Pais() {
        this.nombre = "";
        this.nroDepartamentos = 0;
        this.departamentos1 = new Departamento[0];
    }
    public Pais(String nombre, int nroDepartamentos, Departamento[] departamentos1) {
        this.nombre = nombre;
        this.nroDepartamentos = nroDepartamentos;
        this.departamentos1 = departamentos1;

    }

    public void agregaNuevoDepartamento(Departamento[] nuevoDepartamentos1) {
        this.departamentos1 = nuevoDepartamentos1;

    }

    //get
    public String getNombre() {
        return this.nombre;
    }

    public int getNroDepartamentos() {
        return this.nroDepartamentos;
    }

    public Departamento[] getDepartamentos1() {
        return this.departamentos1;
    }

    //set
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setNroDepartamentos(int nuevoNroDepartamentos) {
        this.nroDepartamentos = nuevoNroDepartamentos;
    }

    public void setDepartamentos(Departamento[] nuevoDepartamento) {
        this.departamentos1 = nuevoDepartamento;
    }

    public void mostrarPais() {
        System.out.println("----------------Datos del pais---------------------");
        System.out.println("Nombre de departamentos: " + getNombre());
        System.out.println("Numero de departamentos: " + getNroDepartamentos());

        for (int i = 0; i < this.getDepartamentos1().length; i++){
            this.getDepartamentos1()[i].mostrarDepartamento();
        }

    }

}
