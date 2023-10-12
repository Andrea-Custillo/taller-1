package py.edu.ucom.AndreaC.controllers.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.annotations.Pos;

import jakarta.activation.DataSource;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import py.edu.ucom.AndreaC.entities.biblioteca.Libros;
import py.edu.ucom.AndreaC.utils.biblioteca.DataSourceJSON;

@Path("/Libros")
public class LibrosResource {
    @Inject
    public DataSourceJSON ds;
   
    @GET
    public List<Libros> obtenerLibros(){
         List<Libros> listaDeLibros = new  ArrayList<>();
        try {
            listaDeLibros = this.ds.obtenerLibros();
        } catch (Exception e) {
            // TODO: handle exception
        }

        

    return listaDeLibros;

    @POST
    public void agregarLibro(Libros params) {
        try {
            this.ds.guardarLibro(params);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    }
   

}
