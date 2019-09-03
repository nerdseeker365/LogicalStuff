package com.corejava.basic;

import java.io.File;

public class ListoutFilesOfADirectory {

	public static void main(String[] args) {

		String filePath="/home/rahul/Pictures/upload";
		
		File folder=new File(filePath);
		
		File[] files=folder.listFiles();
		
		
		for(File file:files) {
			System.out.println("Files::"+file.getName());
		}
		
	}

}
