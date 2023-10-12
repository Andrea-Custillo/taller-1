package py.edu.ucom.AndreaC.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.AndreaC.entities.biblioteca.Libros;
@ApplicationScoped

public class DataSourceJSON {
public void guardarLibro(Libros libros){

    try {
        ObjectMapper mapper = new ObjectMapper();
        List<Libros> lista = obtenerLibros();
        lista.add( libros);
        mapper.writeValue(new File ("C:\\Users\\Andrea\\Desktop\\TALLER\\taller-1\\src\\main\\java\\py\\edu\\ucom\\AndreaC\\utils\\libros.json")))
    } catch (Exception e) {
        // TODO: handle exception
    }

    List<Libros> lista = obtenerLibros();


}
  public List<Libros> obtenerLibros(){
        ObjectMapper mapper = new ObjectMapper();
        List<Libros> libros = new ArrayList<>();
        try {
            libros = mapper.readValue(
                new File ("C:\\Users\\Andrea\\Desktop\\TALLER\\taller-1\\src\\main\\java\\py\\edu\\ucom\\AndreaC\\utils\\libros.json"), new TypeReference<List<Libros>>(){});

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        return libros;

    }
    
}
