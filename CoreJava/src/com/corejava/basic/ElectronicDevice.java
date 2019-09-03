package com.corejava.basic;

import java.util.Date;

public class ElectronicDevice {

	private int deviceId;
	private String devicename;
	private Date manufacturingDate;
	private int warrantyPeriod;

	public ElectronicDevice(int deviceId, String devicename, Date manufacturingDate, int warrantyPeriod) {
		super();
		this.deviceId = deviceId;
		this.devicename = devicename;
		this.manufacturingDate = manufacturingDate;
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "ElectronicDevice [deviceId=" + deviceId + ", devicename=" + devicename + ", manufacturingDate="
				+ manufacturingDate + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

}
