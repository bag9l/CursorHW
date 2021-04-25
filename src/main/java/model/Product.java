package main.java.model;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {

    private final String productId;
    private String name;
    private double price;
    private int amountInStock;
    private ProductCategory category;

    public Product(String name, double price, int amountInStock, ProductCategory category) {
        this.productId = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.amountInStock = amountInStock;
        this.category = category;
    }

    public String getId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        if (amountInStock > 0) {
            this.amountInStock = amountInStock;
        } else {
            throw new RuntimeException("Amount of product can't be null");
        }
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product {" +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", amountInStock=" + amountInStock +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
