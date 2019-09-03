package com.corejava.basic;

import java.io.File;

public class ListOutFilesWithSpecificExtensionOfADirectory {

	public static void main(String[] args) {

		String filePath="/home/rahul/Pictures/upload";
		
		File folder=new File(filePath);
		
		File files[]=folder.listFiles();
		
		for(File file:files) {
			if(file.getName().endsWith(".xml")) {
				System.out.println("Files ends with .xml are::"+file.getName());
			}
		}
	}

}
