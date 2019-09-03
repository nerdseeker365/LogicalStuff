package com.corejava.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListOutAllTheFilesOfADirectory {

	public static void main(String[] args) {

		String path="/home/rahul/Pictures/upload";
		
		try {
			
			//Method-1
			/*
			 * Stream<Path> files=Files.list(Paths.get(path));
			 * 
			 * files.forEach(System.out::println);
			 * 
			 * files.close();
			 */
			
			//Method-2
			Stream<Path> files=Files.walk(Paths.get(path));
			
			files.forEach(System.out::println);
			
			files.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
