package com.streams.operators;

import com.streams.util._Constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F_FlatMap {
    public static void main(String[] args) {
        //conveting the list of list into single list
        //flatmap takes list and returns it stream and while returning it resolves it
        //SO RETURNS STREAM AND RESOLVES IT 
        _Constants.listoflistofproduct.stream().flatMap((listprod)->{
            return listprod.stream();
        }).forEach(System.out::println);


System.out.println("\n --- \n ");


        _Constants.listoflistofproduct.stream().flatMap((listprod)->{
            return listprod.stream().filter((prod)-> prod.getPrice()==23);
        }).map(Object::toString).forEach(log::info);
    }
}
