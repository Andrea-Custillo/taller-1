package py.edu.ucom.AndreaC.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import py.edu.ucom.AndreaC.entities.proyecto.Producto;

public interface ProductoRepository  extends JpaRepository<Producto,Integer>{
    
}
