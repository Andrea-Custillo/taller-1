package py.edu.ucom.AndreaC.services;


import java.util.List;

import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import py.edu.ucom.AndreaC.config.IDAO;
import py.edu.ucom.AndreaC.entities.Cliente;
import py.edu.ucom.AndreaC.repositories.ClienteRepository;


@ApplicationScoped
public class ClienteService implements IDAO<Cliente, Integer> {

    /**
     *
     */
    private static final Logger LOG = Logger.getLogger(ClienteService.class);

    public static Logger getLog() {
        return LOG;
    }

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    @Inject
    private ClienteRepository repository;

    @Override
    public Cliente obtener(Integer param) {
        // TODO Auto-generated method stub
        // Cliente m = new Cliente(1, "TEST", "TEST");
        return this.repository.findById(param).orElse(null);
    }

    @Override
    public Cliente agregar(Cliente param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public Cliente modificar(Cliente param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public void eliminar(Integer param) {
        // TODO Auto-generated method stub

        this.repository.deleteById(param);
    }

    @Override
    public List<Cliente> listar() {
        return this.repository.findAll();
    }

   
    

}
    

   