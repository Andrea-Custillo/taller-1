package py.edu.ucom.AndreaC.entities.biblioteca;

public class Libros {
    public String titulo;
    public String autor;
    public String ISBN;
    public boolean prestado;
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public boolean isPrestado() {
        return prestado;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
  }