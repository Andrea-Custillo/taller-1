package py.edu.ucom.AndreaC.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.ucom.AndreaC.entities.proyecto.MetodoPago;

public interface MetodoPagoRepository extends JpaRepository<MetodoPago,Integer> {
    
}
