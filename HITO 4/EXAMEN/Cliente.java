package defensa_colas_hito4;

public class Cliente {
        private String nombre;
        private String apellido;
        private int edad;
        private String pais;
        private String genero;
        private String tipo;

        public Cliente(String nombre, String apellido, int edad, String pais, String genero, String tipo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.pais = pais;
            this.genero = genero;
            this.tipo = tipo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
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

        //metodo mostrar cliente
        public void mostrarCliente(){

            System.out.println("-------------- Clientes --------------------");

            System.out.println("Nombre: "+nombre);
            System.out.println("Apellido: "+apellido);
            System.out.println("Edad: "+edad);
            System.out.println("Pais: "+pais);
            System.out.println("Genero: "+genero);
            System.out.println("Tipo: "+tipo);
        }

    }

