package py.edu.ucom.AndreaC.controllers.biblioteca;

    import jakarta.ws.rs.Path;
import jakarta.activation.DataSource;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
    import java.util.List;
    import py.edu.ucom.AndreaC.entities.biblioteca.usuarios;
import py.edu.ucom.AndreaC.utils.biblioteca.DataSourceJSON;


@Path("/usuarios")
public class UsuariosResource {
    @Inject
    public DataSourceJSON ds;
    @GET
    public List <usuarios> obtener(){
       
        


    }



    
    
}
