package com.corejava.basic;

import java.util.Comparator;

public class EDeviceNameComparator  implements Comparator<ElectronicDevice>{

	@Override
	public int compare(ElectronicDevice device1, ElectronicDevice device2) {
		
		
		/*
		 * System.out.println("Acsending Order::"+device1.getDevicename().compareTo(
		 * device2.getDevicename())); //return 0; return
		 * device1.getDevicename().compareTo(device2.getDevicename()); //Ascending Order
		 */	
	
		System.out.println("Descending Order::"+device2.getDevicename().compareTo(device1.getDevicename()));
		//return 0;
		return device2.getDevicename().compareTo(device1.getDevicename()); //Ascending Order
	}

}
