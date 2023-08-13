package com.streams.operators;

import java.util.Comparator;
import java.util.stream.Stream;

import com.streams.util.Product;
import com.streams.util._Constants;

public class D_Sorted {
    public static void main(String[] args) {

        //ascending
        _Constants._productList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        
        //descending
        _Constants._productList.stream().sorted((a,b)->b.getName().compareTo(a.getName())).forEach(System.out::println);
        System.out.println("--------------------two or more sorting parameters");
        _Constants._productList.stream().sorted((a,b)->b.getName().compareTo(a.getName())).forEach(System.out::println);
    
        //TODO: HOW TO COMPARE MORE THAN ONE FIELD WITH STREAM DIRECT APPROACH
        // Stream.empty().sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName)).forEach(System.out::println);
    }
}
