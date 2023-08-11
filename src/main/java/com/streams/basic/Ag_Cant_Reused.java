package com.streams.basic;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ag_Cant_Reused {

	public static void main(String[] args) {
		
//		As the IllegalStateException is a RuntimeException, a compiler will not signalize about a problem. 
//		So it is very important to remember that Java 8 {{streams can't be reused.}}
//
//		This kind of behavior is logical. 
//		We designed streams to apply a finite sequence of operations to the source of elements in a functional style, 
//		not to store elements.
		
		Stream<String> stream = 
				  Stream.of("a", "b", "c").filter(element -> element.contains("b"));
				Optional<String> anyElement = stream.findAny();
//				Optional<String> anyElement1 = stream.findFirst(); here we will get exception
				System.out.println(anyElement.get());
				
//				to make above code work as we cant use streams again and again
				List<String> elements =
						  Stream.of("a", "b", "c").filter(element -> element.contains("b"))
						    .collect(Collectors.toList());
						Optional<String> anyElementOptional = elements.stream().findAny(); //any random element
						Optional<String> firstElement = elements.stream().findFirst();
				
				
				
	}
}
