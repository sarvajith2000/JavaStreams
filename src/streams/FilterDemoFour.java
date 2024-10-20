package streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemoFour {
    public static void main(String args[]) {
        List<Product> productList = new ArrayList<>();
        List<Product> finalProduct = new ArrayList<>();
        productList.add(new Product(1, "HP", 25000));
        productList.add((new Product(2, "Lenovo", 40000)));
        productList.add(new Product(3, "acer", 50000));
//        System.out.println(productList);
//        finalProduct = productList.stream().filter(e -> e.price > 26000).toList();
//        System.out.println(finalProduct);
        productList.stream().filter(e -> e.price > 30000).forEach(System.out::println);

    }
}

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
