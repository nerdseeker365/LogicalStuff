package com.corejava.basic;

import java.io.File;

public class ListoutAllFilesOfASubDirectory {

	public static void main(String[] args) {

		String pathname="/home/rahul/Pictures/upload";
		
		listFiles(pathname);
		
		
		
	}
	
	public static void listFiles(String pathname) {
		
		
		//System.out.println("Pathname::"+pathname);
        File folder=new File(pathname);
		
		File[] files=folder.listFiles();
		
		//System.out.println(Arrays.toString(files));
		
		for(File file:files) {
			//System.out.println("Files::"+file.getName());
			if(file.isDirectory()) {
				listFiles(file.getAbsolutePath()); //Recursive call
			}
			else if(file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}

}
