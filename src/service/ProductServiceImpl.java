package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Laptop Dell XPS", 50000000, "Laptop", "Dell"));
        products.put(2, new Product(2, "Toyota Altis", 500000000, "Car", "Toyota"));
        products.put(3, new Product(3, "Adidas Yezzy Boost", 23000000, "Shoes", "Adidas"));
        products.put(4, new Product(4, "Nike Air Force 1", 1500000, "Shoes", "Nike"));
        products.put(5, new Product(5, "Honda Future 125", 10000000, "MotorBike", "Honda"));
        products.put(6, new Product(6, "SamSung Galaxy S7 Edge", 4000000, "Smart Phone", "SamSung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
