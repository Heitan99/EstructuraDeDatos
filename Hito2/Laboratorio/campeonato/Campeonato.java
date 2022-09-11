package campeonato;

public class Campeonato {

     private String nombreCampeonato;

     private equipo[] equipo;

     public Campeonato (String nombreCampeonato, equipo[] equipo){
          this.nombreCampeonato = nombreCampeonato;
          this.equipo = equipo;
     }
     public String getNombreCampeonato(){
          return this.nombreCampeonato;
     }
     public equipo[] getequipo(){
          return this.equipo;
     }

     public void setNombreCampeonato(String nuevoCampeonato){
          this.nombreCampeonato = nuevoCampeonato;
     }
     public void setEquipo(equipo[] nuevaequipo){
          this.equipo = nuevaequipo;
     }

     public void mostrarCampeonato(){
          System.out.println("\nMOSTRANDO DATOS DEL EQUIPO");
          System.out.println("Nombre Campeonato" + this.getNombreCampeonato());

          for(int i=0; i<this.getequipo().length; i++){
               this.getequipo()[i].mostrarEquipo();
          }
     }
}