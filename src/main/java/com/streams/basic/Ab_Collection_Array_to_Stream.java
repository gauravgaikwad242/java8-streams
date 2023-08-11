package com.streams.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Ab_Collection_Array_to_Stream {

	public static void main(String[] args) {
		
		String[] array = {"a","b","c"};
		//array to list
		Collection<String> arraytolist = Arrays.asList(array);
		
		Stream<String> arraytostream = Arrays.stream(array).limit(2); //only two elements will be taken
		
		
 
		
	}
}
