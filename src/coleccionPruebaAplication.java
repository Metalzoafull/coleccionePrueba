import collecciones.Hash;
import collecciones.Producto;


import java.util.HashMap;

public class coleccionPruebaAplication {

    public static void main(String[] args){
        /*
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("USA"));

         */


        Producto papa = new Producto(20,"papa");
        Producto cebolla = new Producto(30,"cebolla");
        Producto espinaca = new Producto(40,"espinaca");
        Hash mercadito = new Hash("verduras","carnes");
        mercadito.comprarVerduras(papa);
        mercadito.comprarVerduras(cebolla);
        mercadito.comprarVerduras(espinaca);
        System.out.print(mercadito.devolver());
        //System.out.print(mercadito.precioTotalVerduras());
        //System.out.print(mercadito.prueba());
        //System.out.print(" " + mercadito.prueba2());
        //System.out.print(mercadito.verdurasMasCaras());
        //System.out.print(mercadito.nombreVerdurasMasCaras());
    }
}
