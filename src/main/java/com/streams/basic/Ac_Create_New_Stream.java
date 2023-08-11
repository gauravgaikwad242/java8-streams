package com.streams.basic;

import java.util.stream.Stream;

public class Ac_Create_New_Stream {

	public static void main(String[] args) {
		//stream builder 
		//Stream.builder()
		Stream<String> withbuilder = Stream.<String>builder().add("abc").add("def").add("ghi").build();
		
		//2.5. Stream.generate()
		//
		Stream<String> withgenerate = Stream.generate(()->{return "element";}).limit(10);
		
		//2.6. Stream.iterate()
		Stream<Integer> withIterate = Stream.iterate(50,(n)-> n+2).limit(10);// 50 52 54
		withIterate.forEach(System.out::println);
	}
}
