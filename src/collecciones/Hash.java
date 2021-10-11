package collecciones;

import java.util.*;
import java.util.stream.Collectors;

public class Hash {

    private HashMap<String, List<Producto>> mercado = new HashMap<String, List<Producto>>();

    public Hash(String... tipoProductos) {
        for (String tipoProducto : tipoProductos) {
            this.mercado.put(tipoProducto, new ArrayList<>());
        }
    }

    public HashMap<String, List<Producto>> devolver(){
        return mercado;
    }

    public void comprarVerduras(Producto producto){
        List<Producto> productos = mercado.get("verduras");
        productos.add(producto);
    }

    public void comprarCarne(Producto producto){
        List<Producto> productos = mercado.get("carnes");
        productos.add(producto);
    }

    public int precioTotalVerduras(){
        List<Producto> productos = mercado.get("verduras");
        return productos.stream()
                .map(Producto::getPrecio)
                //.map(producto -> producto.getPrecio())
                .reduce(Integer::sum).orElse(0);
                //.reduce((a, b) -> a + b).orElse(0);
    }

    public boolean prueba(){
        return mercado.containsKey("verduras");
    }

    public Collection<List<Producto>> prueba2(){
        return mercado.values();
    }

    public List<Integer> verdurasMasCaras(){
        List<Producto> productos = mercado.get("verduras");
        return productos.stream()
                .map(Producto::getPrecio)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
                //.toList();
    }

    public List<String> nombreVerdurasMasCaras(){
        List<Producto> productos = mercado.get("verduras");
        return productos.stream()
                .sorted(Comparator
                        .comparingInt(Producto::getPrecio)
                        .reversed())
                .map(Producto::getNombre)
                .collect(Collectors.toList());
                //.collect(Collectors.toList());
    }

    /*
    Collections.sort(persons, Comparator.comparing(Person::getFname)
    .thenComparingInt(Person::getAge));
     */


}
