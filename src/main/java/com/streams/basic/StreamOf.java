package com.streams.basic;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		
		Stream<String> firstStream = Stream.of("newton","pascal","ohm","coulumb");
		firstStream.forEach((element)-> System.out.println(element));
		
		//if we access same stream again we will get error
		//TODO: why?
		firstStream.forEach((element)-> System.out.println(element));
		
		firstStream.forEach(StreamOf::print);
		
	}
	
	public static void print(String arg) {
		System.out.println("method ref trial: "+arg);
	}
}
