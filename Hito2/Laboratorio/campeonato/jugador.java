package campeonato;

public class jugador {
    private String apellido;
    private String ci;
    private int edad;
    private String nombrecompleto;

    public jugador (String nombrecompleto, String apellido, String ci, int edad){
        this.nombrecompleto = nombrecompleto;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public jugador(){
        this.nombrecompleto=" ";
        this.apellido = " ";
        this.ci = " ";
        this.edad = 0;
    }

    public String getNombrecompleto(){
        return this.nombrecompleto;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCi(){
        return this.ci;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombrecompleto(String nuevoNombre){
        this.nombrecompleto = nuevoNombre;
    }
    public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }
    public void setCi(String nuevoCi){
        this.ci = nuevoCi;
    }
    public void setEdad(int nuevaEdad){
        this.edad = nuevaEdad;
    }

    public void mostrarJugador(){
        System.out.println("\nMOSTRANDO DATOS DEL JUGADOR");
        System.out.println("Nombre Jugador: " + this.getNombrecompleto());
        System.out.println("Apellido Jugador: " + this.getApellido());
        System.out.println("Ci Jugador: " + this.getCi());
        System.out.println("Edad Jugador: " + this.getEdad());
    }
}
