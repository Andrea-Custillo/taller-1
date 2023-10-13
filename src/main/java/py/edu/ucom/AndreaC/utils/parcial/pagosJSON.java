package py.edu.ucom.AndreaC.utils.parcial;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.AndreaC.entities.parcial.clientes;
import py.edu.ucom.AndreaC.entities.parcial.productos;
import py.edu.ucom.AndreaC.entities.parcial.pagos;

@ApplicationScoped

public class pagosJSON {
    public String SRC_CLIENTE ="C:\\Users\\Andrea\\Desktop\\TALLER\\taller-1\\src\\main\\java\\py\\edu\\ucom\\AndreaC\\utils\\árcial\\ListadoClientes.json";
    public String SRC_PRODUCTO="C:\\Users\\Andrea\\Desktop\\TALLER\\taller-1\\src\\main\\java\\py\\edu\\ucom\\AndreaC\\utils\\parcial\\ListadoProductos.json";
    public String SRC_PAGO="C:\\Users\\Andrea\\Desktop\\TALLER\\taller-1\\src\\main\\java\\py\\edu\\ucom\\AndreaC\\utils\\parcial\\pagos.json";

    public void guardarClientes(clientes cliente){

        try {
            ObjectMapper mapper = new ObjectMapper();
            List<clientes> lista = obtenerCliente();
            lista.add( cliente);
            mapper.writeValue(new File (this.SRC_CLIENTE), lista);
        }catch (Exception e) {
        // TODO: handle exception
    }
    }
    public List<clientes> obtenerCliente(){

        ObjectMapper mapper = new ObjectMapper();
        List<clientes> cliente = new ArrayList<>();
        try{
            cliente = mapper.readValue(
                new File (this.SRC_CLIENTE),
                new TypeReference<List<clientes>>(){

                });

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        return cliente;

    }
    
    

    public void guardarProducto( productos producto ){
        try {
    
             ObjectMapper mapper = new ObjectMapper();
            List<productos> lista = obtenerProducto(); 

            lista.add( producto);
            mapper.writeValue(
            new File (this.SRC_PRODUCTO),lista);
               

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
    
    public List<productos> obtenerProducto(){
        ObjectMapper mapper = new ObjectMapper();
        List<productos> data = new ArrayList<>();

        try {
       
        data = mapper.readValue(
            new File (this.SRC_PRODUCTO), 
            new TypeReference <List<productos>> () {
            
        });

    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
    return data;

    }


      public void registrarPagos(pagos pago){

        try {
            ObjectMapper mapper = new ObjectMapper();
            List<pagos> lista = obtenerPago();
            lista.add( pago);
            mapper.writeValue(new File (this.SRC_PAGO), lista);
        } catch (Exception e) {
        // TODO: handle exception
    }
    }
    public List<pagos> obtenerPago(){

        ObjectMapper mapper = new ObjectMapper();
        List<pagos> pagos = new ArrayList<>();
        try {
            pagos = mapper.readValue(
                new File (this.SRC_PAGO),
                new TypeReference<List<pago>>(){

                });

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        

    }

     
}
