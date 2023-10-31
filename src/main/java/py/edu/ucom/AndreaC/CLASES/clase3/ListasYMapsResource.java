package py.edu.ucom.AndreaC.CLASES.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import java.util.HashMap;
import java.util.Date;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;



@Path("/clase-3")
public class ListasYMapsResource {

    @GET
    public List<Integer> getLista(){
        List<Integer> ListaInteger = new ArrayList<>();
        ListaInteger.add(1);
        ListaInteger.add(2);
        ListaInteger.add(3);
        return ListaInteger;
    }
   
    /**
     * @return
     */
    @GET
    @Path("maps")

    public Map<String,Object> getMaps(){
       Map<String,Object> maps = new HashMap<>();
        maps.put("clase-3", "25-09-2023");
        maps.put("clase-4", "1000000");
        maps.put("clase-5", new Date());

        return maps;
    }

    @Override
    public String toString() {
        return "ListasYMapsResource []";
    }   
}

   /*  @GET
    @Path("ejercicio-1")

    public Map<String,Integer> getFrecuencias(){
        Map<String,Object> maps = new HashMap<>();
        String entrada = "Texto clase-3 hola hola data";
        entrada.toLowerCase();

        return maps;

    }


    public Map<String,Integer> contadordepalabras(){    
        String texto = "este es un ejemplo de texto";

        //dividir el texto en palabras y almacenarla en una lista
        String[] palabras=texto.split("\\s+");
        List<String> listapalabras = new ArrayList<>();

        for (String palabra : palabras){
            palabra = palabra.replaceAll("[ a-b-c],", "").toLowerCase();

            if (!palabra.isEmpty()){
                listapalabras.add(palabra);

            }

        }
            Map<String, Integer> contadordepalabras = new HashMap<>();

            for(String palabra : listapalabras){
                 if(contadordepalabras.constainskey(palabra)){
                    int frecuencia = contadordepalabras.get(palabra);
                    contadordepalabras.put(palabra, frecuencia + 1 );
                 }else{
                    contadordepalabras().put(palabra, 1);
                 }
            
           */