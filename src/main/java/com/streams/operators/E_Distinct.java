package com.streams.operators;

import com.streams.util._Constants;

public class E_Distinct {
    public static void main(String[] args) {

        //it uses equals and hashcode to compare here i have applied it to only product.name
        _Constants._productList.stream().distinct().forEach(System.out::println);
    }
}
