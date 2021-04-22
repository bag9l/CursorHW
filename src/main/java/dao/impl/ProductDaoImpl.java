package main.java.dao.impl;

import main.java.dao.DB.ProductDB;
import main.java.dao.ProductDao;
import main.java.model.Product;
import main.java.model.ProductCategory;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDaoImpl implements ProductDao {
    private ProductDB productDB = new ProductDB();

    @Override
    public void addProductDB(Product product) {
        if (isProductInDatabase(product.getId())) {
            System.out.println("Product already exists in the database.");
        } else {
            try {
                productDB.getProductDB().add(product);
            } catch (Exception e) {
                System.out.println("Problem with adding a Product to the database.");
            }
        }
    }

    @Override
    public void showListAllProductsInDB() {
        var set = productDB.getProductDB().stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        set.forEach((category, productList) ->
                productList.forEach(product -> System.out.println("\t\t\t\u25B6 " + product)));
    }

    @Override
    public Product getProductsByName(String productName) {
        Product product = null;
        Optional<Product> optionalProduct = productDB.getProductDB().stream()
                .filter(productModel -> productModel.getName().equals(productName))
                .findFirst();
        if (optionalProduct.isPresent()) {
            product = optionalProduct.get();
        } else {
            System.out.printf("Product with productName = %s not found.", productName);
        }
        return product;
    }

    @Override
    public Product orderProductsByNameAndQuantity(String name, int quantity) {
        var product = getProductsByName(name);
        if (quantity > 0) {
            product.setAmountInStock(product.getAmountInStock() - quantity);
        } else {
            throw new RuntimeException("Quantity couldn't be less then 1");
        }
        return product;
    }

    @Override
    public Set<Product> getProductsByCategory(ProductCategory category) {
        var productSet = productDB.getProductDB().stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toSet());
        if (!productSet.isEmpty()) {
            return productSet;
        } else {
            System.out.printf("User with username = %s not found.", category);
            return null;
        }
    }

    public Product getProductsById(long productId) {
        Product product = null;
        Optional<Product> optionalProduct = productDB.getProductDB().stream()
                .filter(productModel -> productModel.getId() == productId)
                .findFirst();
        if (optionalProduct.isPresent()) {
            product = optionalProduct.get();
        } else {
            System.out.printf("Product with productId = %s not found.", productId);
        }
        return product;
    }

    @Override
    public void removeProduct(long productId) {
        if (isProductInDatabase(productId)) {
            boolean productIsRemoved = false;
            try {
                productIsRemoved = productDB.getProductDB().remove(getProductsById(productId));
            } catch (Exception e) {
                System.out.printf("Problem during removing a user with id = %s from the database", productId);
            }
            if (productIsRemoved) {
                System.out.printf("User with id = %s was removed.", productId);
            }
        } else {
            System.out.printf("User with id = %s not found.", productId);
        }

    }

    private boolean isProductInDatabase(long productID) {
        return productDB.getProductDB().stream().anyMatch(product -> product.getId() == productID);
    }
}