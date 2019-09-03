package com.corejava.basic;

import java.io.File;

public class ListOutSubDirectoryOfADirectory {

	public static void main(String[] args) {

		String filePath="/home/rahul/Pictures/upload";

		
        File folder=new File(filePath);
		
		File files[]=folder.listFiles();
		
		for(File file:files) {
			if(file.isDirectory()) {
				System.out.println("Subdirectory::"+file.getName());
			}
		}
	}

}
