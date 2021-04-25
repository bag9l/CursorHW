package main.java.dao.inmemorydb;

import main.java.dao.ProductDao;
import main.java.model.Product;
import main.java.model.ProductCategory;

import java.util.List;

public class ProductInMemoryDao implements ProductDao {

    // TODO:
    // 1. Make this class Singleton
    // 2. Implement methods

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public Product getProductById(String productId) {
        return null;
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategory(ProductCategory category) {
        return null;
    }

    @Override
    public void removeProduct(String productId) {

    }
}