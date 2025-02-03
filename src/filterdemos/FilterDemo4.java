package filterdemos;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo4 {

    static class Product {
        int id;
        String name;
        double price;

        public Product(int id, String name, double price){
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "HP Laptop", 25000));
        products.add(new Product(2, "Dell Laptop", 30000));
        products.add(new Product(3, "Lenovo Laptop", 28000));
        products.add(new Product(4, "Sony Laptop", 23000));
        products.add(new Product(5, "Apple Laptop", 90000));

        List<Product> productsFiltered = products.stream()
                .filter(product -> product.price > 25000)
                .toList();

        productsFiltered.forEach(product -> System.out.println(product.toString()));
    }

}
