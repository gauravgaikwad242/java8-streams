package com.streams.StreamPipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class E_REDUCER_2 {
	static int counter = 0;
	static int counter1 = 10;
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ram","laxman","shyam","jay","apple", "banana", "cherry", "date");
		long start = System.currentTimeMillis();
				list.parallelStream().reduce(new ArrayList<String>(),(a,b)->{
					counter++;
					System.out.println("a: "+a+"  b: "+b+"  count: "+counter+" thread: "+Thread.currentThread().getName());
			a.add(b);
			return a;
		},(c,d)-> {
			counter1++;
			System.out.println("c: "+c+"d: "+d+"  count: "+counter1+" thread: "+Thread.currentThread().getName());
			// c.addAll(d);
			return c;
		}).stream().forEach((x)-> System.out.println(x));
				long end = System.currentTimeMillis();
				System.out.println("totoal time: "+(end-start));
		
		Stream<String> wordsStream = Stream.of("apple", "banana", "cherry", "date");

        List<String> wordList = wordsStream.reduce(
            new ArrayList<>(),  // Identity: An empty ArrayList to start accumulation
            (list11, word) -> {   // Accumulator: Add each word to the list
                list11.add(word);
                return list11;
            },
            (list1, list2) -> { // Combiner: Combine two lists into one
                list1.addAll(list2);
                return list1;
            }
        );

        log.info("word list"+wordList);
		
	}
}
