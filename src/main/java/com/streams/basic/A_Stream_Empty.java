package com.streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_Stream_Empty {
//********************************************************************************************** */
//*********************** ALWAYS CLOSE A STREAM TO AVOID MEMORY LEAKS  **************************** */
//************************************************************************************************* */
	public static void main(String[] args) {
		
		//to create empty stream
		Stream<String> emptyStream = Stream.empty();
		List<String> emptyList = null;
		try {
			emptyList.stream().forEach(System.out::println); //here we get null pointer exception
		} catch (NullPointerException e) {
			System.out.println("exception occured");
		}finally {
			//to avoid nullpointerexception
			System.out.println("in finally block no exception here as we handled it");
			Stream<String> listtostream = emptyList == null ? Stream.empty() : emptyList.stream();
			listtostream.forEach((ele)->System.out.println(ele));
		}

	}
}
