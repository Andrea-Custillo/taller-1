package py.edu.ucom.AndreaC.entities.biblioteca;

import java.util.List;



public class usuarios {
    public String nombre;
    public String documento;
    public List<Libros> librosPrestado;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public List<Libros> getLibrosPrestado() {
        return librosPrestado;
    }
    public void setLibrosPrestado(List<Libros> librosPrestado) {
        this.librosPrestado = librosPrestado;
    }

}

    


