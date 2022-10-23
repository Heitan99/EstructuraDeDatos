package Libros;

public class Libro {
        private String titulo;
        private String autor;
        private int nroPag;
        private double Precio;
        private String Categoria;

        public Libro(String titulo, String autor, int nroPag, double Precio, String Categoria)
        {
            this.titulo = titulo;
            this.autor = autor;
            this.nroPag = nroPag;
            this.Precio = Precio;
            this.Categoria = Categoria;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getNroPag() {
            return nroPag;
        }

        public double getPrecio() {
            return Precio;
        }

        public String getCategoria() {
            return Categoria;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setNroPag(int nroPag) {
            this.nroPag = nroPag;
        }

        public void setPrecio(double precio) {
            Precio = precio;
        }

        public void setCategoria(String categoria) {
            Categoria = categoria;
        }

        public void mostrarLibros()
        {
            System.out.println("/nMostrar LIBRO");
            System.out.println("Titulo: " + this.getTitulo());
            System.out.println("Categoria: " + this.getCategoria());
            System.out.println("Nro de Paginas: " + this.getNroPag());
            System.out.println("Precio: " + this.getPrecio());
            System.out.println("Nro de Categoria: " + this.getCategoria());

        }

}
