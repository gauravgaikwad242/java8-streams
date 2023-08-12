package com.streams.StreamPipeline;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class G_Collect_Adv {
    public static void main(String[] args) {
        //Collectors has some more features for sum, avg,
        //it can also eliminate need for map for mapping

        // Collectos have many funtions [[collectors]]
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

                productList.stream().collect(Collectors.summingInt(Product::getId));
                int  sum  =   productList.stream().collect(Collectors.summingInt(product-> product.getId()));
                
            //this will give all summary like avg, max, min, sum
              IntSummaryStatistics a =  productList.stream().collect(Collectors.summarizingInt(Product::getId));
              System.out.println("summary : "+a.toString());

        //group by will return map 
        Map<Integer, List<Product>> groupby = productList.stream().collect(Collectors.groupingBy((product)->product.getId()));
        System.out.println(groupby.toString());        

        // partitioning according to some condition
        Map<Boolean, List<Product>> mapPartioned = productList.stream()
                .collect(Collectors.partitioningBy(element -> element.getId() > 15));
        System.out.println(mapPartioned);

        //collectors to do additional transformation after basic operations
        Set<Product> b = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),(set)-> {
            Set<Product> productss =  set.stream().map((prod)->{
                prod.setName(prod.getName().toUpperCase());
                return prod;
            }).collect(Collectors.toSet());
            return productss;
        }));
    System.out.println(b);
            }
}
