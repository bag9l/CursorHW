package main.java.model;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private double price;
    private int amountInStock;
    private ProductCategory category;

    public Product(String name, double price, int amountInStock, ProductCategory category) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.price = price;
        this.amountInStock = amountInStock;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
            System.out.println("Amount of product can not be null");
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
                "id=" + id +
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
        Product that = (Product) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
