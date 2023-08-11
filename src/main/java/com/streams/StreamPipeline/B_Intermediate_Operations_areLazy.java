package com.streams.StreamPipeline;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class B_Intermediate_Operations_areLazy {

	public static void main(String[] args) {
//		Intermediate operations are lazy. 
//		This means that they will be invoked only if it is necessary for the terminal operation execution.
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		
		Stream<String> stream = list.stream().filter(element -> {
		    return element.contains("2");
		}); // this code will not be executed as there is no termminal operation
		
		//we need terminal operation to invoke the stream 
		
		Optional<String> stream1 = list.stream().filter(element -> {
		    return element.contains("2");
		}).map(element -> {
		    return element.toUpperCase();
		}).findFirst();
		//here the code will be called as tehre is terminal opertaion
		
	}
}
