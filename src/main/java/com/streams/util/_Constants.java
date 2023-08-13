package com.streams.util;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class _Constants {
    public static final List<Product> _productList = Arrays.asList(new Product(23, "potatoes"),
            new Product(63, "sugar"), new Product(13, "sugar"),
            new Product(9, "orange"), new Product(13, "bread"),
            new Product(9, "sugar"), new Product(13, "potatoes"),
            new Product(14, "orange"), new Product(13, "potatoes"),
            new Product(5, "bread"), new Product(13, "lemon"),
            new Product(5, "sugar"), new Product(13, "bread"),
            new Product(23, "potatoes"), new Product(13, "bread"),
            new Product(23, "orange"), new Product(13, "lemon"),
            new Product(14, "potatoes"), new Product(13, "bread"),
            new Product(14, "orange"), new Product(13, "lemon"),
            new Product(5, "bread"), new Product(13, "sugar"));

    public static final List<Product> allmatchproductList = Arrays.asList(new Product(23, "potatoes"),
            new Product(23, "potatoes"), new Product(13, "potatoes"),
            new Product(9, "potatoes"), new Product(13, "potatoes"),
            new Product(9, "potatoes"), new Product(13, "potatoes")
           );
}
