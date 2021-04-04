package com.company.part2.interfaces;

import com.company.part2.Product;

import java.util.List;

public interface ProductsForAdults {
    void productsForAdults(List<? extends Product> list);
}
