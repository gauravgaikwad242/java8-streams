package com.streams.operators;

import com.streams.util._Constants;

public class A_AnyMatch {
     public static void main(String[] args) {

         //like some in javascirpt : are some of them matching then true
        boolean isthereanypriceequalsto = _Constants._productList.stream().anyMatch((product)-> (product.getPrice() == 5));
        System.out.println("is there any price equal to: "+isthereanypriceequalsto);
        System.out.println();
        boolean _isthereanypriceequalsto = _Constants._productList.stream().anyMatch((product)-> (product.getPrice() == 50));
        System.out.println("is there any price equal to: "+_isthereanypriceequalsto);
     }
}
