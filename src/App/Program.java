package App;

import java.util.HashMap;
import java.util.Map;
import App.entities.Product;

public class Program {

    public static void main(String[] args) {

        // instancia o map
        Map<Product, Double> stock = new HashMap<>();
        
        // instancia um novo product.
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        
        // define o estoque do produto instanciado
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        
        // instancia um novo product.
        Product ps = new Product("Tv", 900.0);
        
        // verifica com o hashcode e equals se existe o a chave 'ps' no map
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }

}
