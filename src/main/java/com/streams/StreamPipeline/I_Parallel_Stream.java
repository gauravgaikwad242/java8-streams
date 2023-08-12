package com.streams.StreamPipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class I_Parallel_Stream {
    public static void main(String[] args) {
        // TODO : will do later
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
        Stream<Product> streamOfCollection = productList.parallelStream();
        boolean isParallel = streamOfCollection.isParallel();
        boolean bigPrice = streamOfCollection
                .map(product -> product.getId() * 12)
                .anyMatch(price -> price > 200); //[[anymatch]]
    }
}
