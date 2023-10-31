package py.edu.ucom.AndreaC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.ucom.AndreaC.entities.Venta;


public interface VentaRepository extends JpaRepository<Venta, Integer> {
    
}

