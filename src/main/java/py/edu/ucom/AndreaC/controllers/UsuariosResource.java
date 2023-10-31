package py.edu.ucom.AndreaC.controllers;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
@Path("/usuarios")

public class UsuariosResource {

    /* @Inject
    public DataSourceJSON ds;

    @GET
    public List<Usuarios> obtener(){
        return this.ds.obtenerUsuarios();
    }
    @GET
    @Path("{documento}")
    public Usuarios obtenerByDocumento(@PathParam("documento")String param){
        return this.ds.buscarUsuario(param);
    }
 */
    @POST
    public void guardar(Object usuario){
      //  this.ds.guardarUsuarios(usuario);
    }
    
}