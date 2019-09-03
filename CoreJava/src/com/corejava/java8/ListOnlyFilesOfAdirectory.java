package com.corejava.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListOnlyFilesOfAdirectory {

	public static void main(String[] args) {

		String path="/home/rahul/Pictures/upload";
		
		try {
			Stream<Path> files=Files.list(Paths.get(path));
			
			files.filter(Files::isRegularFile).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
