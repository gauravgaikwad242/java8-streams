package com.streams.operators;

import com.streams.util._Constants;

public class C_NoneMatch {
    public static void main(String[] args) {
        boolean arenoneofthemmatch = _Constants._productList.stream().noneMatch((product)->product.getName().equals("gaurav"));
        System.out.println("are none of them are mathcing to gaurav: "+arenoneofthemmatch);
System.out.println();
        boolean arenoneofthemmatch1 = _Constants._productList.stream().noneMatch((product)->product.getName().equals("potatoes"));
        System.out.println("are none of them are mathcing to potatoes that is, is there no string similar to potatoes: "+arenoneofthemmatch1);
    }
}
