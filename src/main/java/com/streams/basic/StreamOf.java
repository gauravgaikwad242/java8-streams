package com.streams.basic;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		
		Stream<String> firstStream = Stream.of("newton","pascal","ohm","coulumb");
		firstStream.forEach(StreamOf::print);
		
		
	}
	
	public static void print(String arg) {
		System.out.println("method ref trial: "+arg);
	}
}
