package com.company.Part2.Interfaces;

import com.company.Part2.Product;

import java.util.List;

public interface ExpiredProducts {
    void expiredProducts(List<? extends Product> list);
}
