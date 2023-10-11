package py.edu.ucom.AndreaC.controllers;

import java.util.ArrayList;
import java.util.List;
import jakarta.activation.DataSource;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import py.edu.ucom.AndreaC.entities.biblioteca.Libros;
import py.edu.ucom.AndreaC.utils.DataSourceJSON;

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

    }
   

}
