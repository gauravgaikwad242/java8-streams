package com.streams.basic;

import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ad_IntStream_ofPrimitives {

	public static void main(String[] args) {
		//2.7. Stream of Primitives
		
		List<Integer> list = List.of(1,2,4,2,4,52);
		IntStream intstream = IntStream.range(0, 20);
		
		IntStream listintstream = IntStream.range(0, list.size());
		listintstream.forEach(System.out::println); //0 1 2 3 4 5 last excluded
		
		IntStream listintstream2 = IntStream.rangeClosed(0, list.size());
		listintstream2.forEach(System.out::println); //0 1 2 3 4 5 6 last included
		
		
//		Since Java 8, the Random class provides a wide range of methods for generating streams of primitives.
//		For example, the following code creates a DoubleStream, which has three elements:
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3); //stream of three elements
	}
}
