package py.edu.ucom.AndreaC.controllers.parcial;

    import java.util.ArrayList;
    import java.util.List;
    import org.jboss.logging.annotations.Pos;

    import jakarta.activation.DataSource;
    import jakarta.inject.Inject;
    import jakarta.ws.rs.GET;
    import jakarta.ws.rs.POST;
    import jakarta.ws.rs.Path;
    import py.edu.ucom.AndreaC.entities.biblioteca.Libros;
    import py.edu.ucom.AndreaC.entities.parcial.pagos;
    import py.edu.ucom.AndreaC.utils.biblioteca.DataSourceJSON;
    import py.edu.ucom.AndreaC.utils.parcial.pagosJSON;

    @Path("/Registradora")
    public class CajaResource {

        @Inject
        public pagos ds;
    
        @GET
        public List<pagos> obtenerpago(){
            List<pagos> listapagos = new  ArrayList<>();
            try {
                listapagos = this.ds.obtenerpago();
            } catch (Exception e) {
                // TODO: handle exception
            }

            

        return listapago;

        @POST
        public void registrarpago(pagos params) {
            try {
                this.ds.registrarpago(params);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }


        
    

    }


            

}
