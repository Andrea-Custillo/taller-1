package py.edu.ucom.AndreaC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.ucom.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    
}
