package py.edu.ucom.AndreaC.services;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import py.edu.ucom.AndreaC.config.IDAO;
import py.edu.ucom.AndreaC.entities.MetodoPago;
import py.edu.ucom.AndreaC.repositories.MetodoPagoRepository;





@ApplicationScoped

public class MetodoPagoService implements IDAO<MetodoPago, Integer>{

    /**
     *
     */
    private static final Logger LOG = Logger.getLogger(MetodoPagoService.class);

    public static Logger getLog() {
        return LOG;
    }

    @Inject
    private MetodoPagoRepository repository;

    @Override
    public MetodoPago obtener(Integer param) {
        // TODO Auto-generated method stub
        // MetodoPago m = new MetodoPago(1, "TEST", "TEST");
        return this.repository.findById(param).orElse(null);
    }

    @Override
    public MetodoPago agregar(MetodoPago param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public MetodoPago modificar(MetodoPago param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public void eliminar(Integer param) {
        // TODO Auto-generated method stub

        this.repository.deleteById(param);
    }

    @Override
    public List<MetodoPago> listar() {
        return this.repository.findAll();
    }

    /**
     * @param cod
     * @return
     */
    public List<MetodoPago> buscarPorCodigo(String cod) {
        return this.repository.findByCodigo(cod);
    }

    public Long sumIds() {
        return this.repository.sumId();
    }

    public List<MetodoPago> paginado(Integer pagina, Integer cantidad) {

        Page<MetodoPago> lista = this.repository.findAll(
                PageRequest.of(pagina, cantidad

                ));
        return lista.getContent();
    }

}


    


