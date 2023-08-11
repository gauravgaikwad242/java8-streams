package com.streams.basic;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Af_File_Stream {

	public static void main(String[] args) throws IOException {
		String strpath = "C:\\Users\\gaikw\\Desktop\\Developer\\jstrials\\Js.java";
		
		Path path = Paths.get(strpath);
		
		Stream<String> streamOfStrings = Files.lines(path);
		streamOfStrings.forEach((x)-> System.out.println("new line : "+x)); //each line will be one element in stream
		streamOfStrings.close();
		
		Stream<String> streamWithCharset = 
				  Files.lines(path, Charset.forName("UTF-8"));
		streamWithCharset.close();
	}
}
