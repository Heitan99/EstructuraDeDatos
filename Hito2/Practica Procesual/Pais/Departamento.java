package Pais;

public class Departamento {

    private String nombre;
    private Provincia[] nroProvincias;

    public Departamento() {
        this.nombre = "";
        this.nroProvincias = new Provincia[0];
    }
    public Departamento(String nombre, Provincia[] nroProvincias) {
        this.nombre = nombre;
        this.nroProvincias = nroProvincias;
    }
    //crear un metodo que ingrese una provincia

    public void agregaNuevaProvincia(Provincia[]  nuevoNroProvincias) {
        this.nroProvincias=nuevoNroProvincias;
    }


     //get
    public String getNombre() {
        return this.nombre;
    }

    public Provincia[] getNroProvincias() {
        return this.nroProvincias;
    }
    //set
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    //set
    public void setNroProvincias(Provincia[] nuevoNroProvincias){
        this.nroProvincias = nuevoNroProvincias;
    }

    //mostrar
    public void mostrarDepartamento(){
        System.out.println("-------------------- Datos de departamento ---------------");
        System.out.println("Nombre del departamento: "+getNombre());

        for(int i=0;i <this.getNroProvincias().length;i++) {
            this.getNroProvincias()[i].mostrarProvincia();
        }
    }


}

