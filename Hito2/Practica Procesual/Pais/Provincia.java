package Pais;

public class Provincia {
    
   private String nombre;

   //constructor sin parametros
   public Provincia(){
       this.nombre="";
   }

   public Provincia(String nombre){
       this.nombre=nombre;
   }


   //get obtner
    public String getNombre(){
       return this.nombre;
    }

    //set = establecer
    public void setNombre(String nuevoNombre){
       this.nombre=nuevoNombre;
    }

    //mostrar provincia
    public void mostrarProvincia(){
        System.out.println("------------------ Datos de Provincia -----------------------------");
        System.out.println("Nombre de provincia: "+getNombre());
    }


}


