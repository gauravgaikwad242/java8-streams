package com.streams.basic;

import java.util.stream.IntStream;

public class Ae_StreamOf_Chars {

	public static void main(String[] args) {
		
		IntStream streamofChars = "abc".chars();
		streamofChars.forEach((x)-> System.out.println(x)); //97 98 99 ascii i guess
		
		
	}
}
