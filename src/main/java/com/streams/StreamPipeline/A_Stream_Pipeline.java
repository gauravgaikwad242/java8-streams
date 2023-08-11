package com.streams.StreamPipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_Stream_Pipeline {

	public static void main(String[] args) {
		
//		To perform a sequence of operations over the elements of the data source and aggregate their results,
//		we need three parts: 
//			1. source, 
		//  2. intermediate
//			3. terminal operation.
		
		//[[Skip]]
		Stream<String> stream = Stream.of("abcd1","efg1h","i1jkl").skip(1); //skip first
//		stream.forEach(System.out::println); //ignores first element
		
		//chaining
		Stream<String> twiceModifiedStream =
				  stream.skip(1).map(element -> element.substring(0, 3));
		
		List<String> str = Arrays.asList("jdlee","kfjees","kffseeff","abeebc","adeer");
		
		long sizeofstream =  str.stream()
								.skip(1)
								.map((x)-> x.substring(0, 3))
								.sorted() //[[sorted]]
								.count(); // [[count]]
		System.out.println(sizeofstream); //4
	}
}
