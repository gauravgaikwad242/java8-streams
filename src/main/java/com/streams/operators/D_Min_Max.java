package com.streams.operators;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.streams.util.Product;
import com.streams.util._Constants;

public class D_Min_Max {
    public static void main(String[] args) {

    
        // Using min to find the smallest element
        Optional<Product> whichIsMinimum = _Constants._productList.stream().min((a,b)->Integer.valueOf(a.getPrice()).compareTo(b.getPrice()));
        System.out.println(whichIsMinimum.toString());
        // Using max to find the largest element
        Optional<Product> whichIsMaximum = _Constants._productList.stream().max((a,b)->Integer.valueOf(a.getPrice()).compareTo(b.getPrice()));
        System.out.println(whichIsMaximum.toString());
    }
}
