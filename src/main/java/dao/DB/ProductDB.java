package main.java.dao.DB;

import main.java.model.Product;

import java.util.HashSet;

public class ProductDB {
    private HashSet<Product> productsDB = new HashSet<>();

    public HashSet<Product> getProductDB() {
        return productsDB;
    }
}
