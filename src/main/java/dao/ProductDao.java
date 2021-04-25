package main.java.dao;

import main.java.model.Product;
import main.java.model.ProductCategory;

import java.util.Set;

public interface ProductDao {
    void addProductDB(Product product);

    void showListAllProductsInDB();

    Product getProductsByName(String name);

    Product buyProductsByNameAndQuantity(String name, int quantity);

    Set<Product> getProductsByCategory(ProductCategory category);

    void removeProduct(long productId);
}
