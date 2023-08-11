package com.streams.StreamPipeline;

import java.util.List;

public class C_Order_of_Execution {
public static void main(String[] args) {
	// for performance the order should be correct
	
//	1. here map will be called 3 times as wrong order
	long size = List.of("abc33","de33f","jf22sl").stream().map(element -> {
	    return element.substring(0, 3);
	}).skip(2).count();
	
//	2. here map will be called 1 time only as order is correct
	long size1 = List.of("abc33","de33f","jf22sl").stream().skip(2).map(element -> {
	    return element.substring(0, 3);
	}).count();
}
}
