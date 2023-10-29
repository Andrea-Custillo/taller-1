package py.edu.ucom.AndreaC.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import py.edu.ucom.AndreaC.entities.proyecto.Venta;
import py.edu.ucom.AndreaC.entities.proyecto.VentaDetalle;


public interface VentaDetalleRepository  extends JpaRepository<VentaDetalle,Integer>{

    
    
}
