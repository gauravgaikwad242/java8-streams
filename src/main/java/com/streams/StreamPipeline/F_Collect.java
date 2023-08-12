package com.streams.StreamPipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Data;

public class F_Collect {
    public static void main(String[] args) {
        // collect is used to reduce to and acts as an terminal opertaion
        List<Integer> even = Stream.iterate(1, (n)->{
            return n+1;
        }).limit(3).collect(Collectors.toList());

        //collect to string
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        String allnames = productList.stream().map((prod)->prod.getName()).collect(Collectors.joining(", ","All Names Are: "," - finished"));
        System.out.println(allnames);
        //collecting to list similar to ccllectors.tolist [[reduce]]
        List<Integer> evenone = Stream.iterate(1, (n)->{
            return n+1;
        }).limit(3).reduce(new ArrayList<Integer>(), (acc, newVal)->{
            acc.add(newVal);
            return acc;
        }, (c,d)->{
            return null;
        });

        System.out.println(evenone);

    }
    
}
@Data
@AllArgsConstructor
class Product {
    int id;
    String name;

}