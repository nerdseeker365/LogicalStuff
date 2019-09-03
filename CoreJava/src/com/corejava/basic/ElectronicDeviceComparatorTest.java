package com.corejava.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ElectronicDeviceComparatorTest {

	
	private static List<ElectronicDevice> deviceList=new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {

		Scanner scanner=new Scanner(System.in);
		int deviceid=0;
		String devicename=null;
		String manufacturingDate=null;
		int period=0;
		int n=0;
		
		
		System.out.println("Enter how many Device you want to add::");
		n=scanner.nextInt();
		
		
        while(n>0) {
        	
        	System.out.println("Enter Device id::");
    		deviceid=scanner.nextInt();
    		scanner.nextLine();
    		
    		System.out.println("Enter Device Name::");
    		devicename=scanner.nextLine();
    		
    		System.out.println("Enter Manufacturing Date::");
    		manufacturingDate=scanner.nextLine();
    		
    		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
    		
    		Date manufacturDate=sdf.parse(manufacturingDate);

            
    		System.out.println("Enter Warranty Period::");
    		period=scanner.nextInt();
    		
    		ElectronicDevice edevice=new ElectronicDevice(deviceid, devicename, manufacturDate, period);
    		
    		addProductIntoList(edevice);
        	
        	n--;
        }
        
        Collections.sort(deviceList, new EDeviceNameComparator());
        
        System.out.println("All Devices Are::");
        //display List data
        deviceList.forEach(System.out::println);
	    
	}
	
	private static void addProductIntoList(ElectronicDevice device) {
		
		deviceList.add(device);
	}

}
