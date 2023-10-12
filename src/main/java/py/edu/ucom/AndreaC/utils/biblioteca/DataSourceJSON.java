package py.edu.ucom.AndreaC.utils.biblioteca;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.AndreaC.entities.biblioteca.Libros;
import py.edu.ucom.AndreaC.entities.biblioteca.usuarios;
@ApplicationScoped

public class DataSourceJSON {
    public String SRC_USUARIOS ="C:\\Users\\Andrea\\Desktop\\TALLER\\taller-1\\src\\main\\java\\py\\edu\\ucom\\AndreaC\\utils\\usuarios.json";
    public String SRC="C:\\Users\\Andrea\\Desktop\\TALLER\\taller-1\\src\\main\\java\\py\\edu\\ucom\\AndreaC\\utils\\libros.json";

    public void guardarLibro(Libros libros){

        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Libros> lista = obtenerLibros();
            lista.add( libros);
            mapper.writeValue(new File (this.SRC), lista);
        } catch (Exception e) {
        // TODO: handle exception
    }
    }
    public List<Libros> obtenerLibros(){

        ObjectMapper mapper = new ObjectMapper();
        List<Libros> libros = new ArrayList<>();
        try {
            libros = mapper.readValue(
                new File (this.SRC),
                new TypeReference<List<Libros>>(){

                });

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        return libros;

    }
    
    

    public void guardarUsuario( usuarios usuario ){
        try {
    
             ObjectMapper mapper = new ObjectMapper();
            List<usuarios> lista = obtenerUsuarios();

            lista.add( usuario);
            mapper.writeValue(
            new File (this.SRC),lista);
               

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        


    }
    
    public List<usuarios> obtenerUsuarios(){
        ObjectMapper mapper = new ObjectMapper();
        List<usuarios> data = new ArrayList<>();

        try {
       
        data = mapper.readValue(
            new File (this.SRC_USUARIOS), 
            new TypeReference <List<usuarios>> () {
            
        });

    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
    return data;

    }

     
}
