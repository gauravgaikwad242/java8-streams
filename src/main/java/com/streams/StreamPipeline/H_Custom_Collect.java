package com.streams.StreamPipeline;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class H_Custom_Collect {
    
    public static void main(String[] args) {
        // custom collectors is similar to reduce method
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(23, "orange"), new Product(13, "lemon"),
                new Product(9, "orange"), new Product(13, "lemon"),
                new Product(9, "orange"), new Product(13, "lemon"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(5, "orange"), new Product(13, "lemon"),
                new Product(5, "orange"), new Product(13, "lemon"),
                new Product(23, "orange"), new Product(13, "lemon"),
                new Product(23, "orange"), new Product(13, "lemon"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(5, "bread"), new Product(13, "sugar"));

        Collector<Product, ?, LinkedList<Product>> toLinkedList = Collector.of(LinkedList::new, LinkedList::add,
                (first, second) -> {
                    first.addAll(second);
                    return first;
                });

                //simplified above code with lambda
        Collector<Product, ?, LinkedList<Product>> toLinkedListwithLambda = Collector.of(
                () -> new LinkedList<>(), // Supplier: Create a new LinkedList
                (list, product) -> list.add(product), // Accumulator: Add product to the list
                (first, second) -> { // Combiner: Combine two LinkedLists
                    first.addAll(second);
                    return first;
                });
        LinkedList<Product> linkedListOfPersons = productList.stream().collect(toLinkedList);
    }
}
