package com.streams.StreamPipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class D_Reducer {

	public static void main(String[] args) {

		//slightly diff than js reduce but same
		
		int sum =  Stream.of(1,2,3)
				.reduce(10,						//initial value of oldval
						(oldval,newval)->{
			return oldval + newval;
		});
		System.out.println("sum is : "+sum); //10 + 1 + 2 + 3 = 16
		
		//accumulator
		int reducedParallel = Arrays.asList(1, 2, 3, 4, 5).parallelStream()
			    .reduce(10, (c, d) ->{
			    	System.out.println("inner called: "+c+" "+d);
			    	return c + d;}, (a, b) -> {
			    		System.out.println("later called : "+a+" "+b);
			       return a + b;
			    });
		System.out.println(reducedParallel);
		
//		   1. The accumulator function (c, d) -> c + d is applied to the substreams simultaneously:
//			Substream 1: Accumulator: c = 10, d = 1 → c + d = 11
//			Substream 2: Accumulator: c = 10, d = 2 → c + d = 12
//			Substream 3: Accumulator: c = 10, d = 3 → c + d = 13
//			2. The combiner function (a, b) -> a + b is invoked to combine the results from the substreams:
//			Combiner: a = 11, b = 12 → a + b = 23
//			Combiner: a = 23, b = 13 → a + b = 36
		String ab = Arrays.asList("one","two","three").parallelStream().reduce("zero ", (a,b)->{
			System.out.println("inner called : "+a+" "+b);
			return a+b;
		},(c,d)->{
			System.out.println("later called: "+c+" "+d);
			return c+" : "+d;
		});
		System.out.println(ab);
	}
}
