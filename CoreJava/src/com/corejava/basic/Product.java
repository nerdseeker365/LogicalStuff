package com.corejava.basic;

import java.util.Date;

public class Product implements Comparable<Product>{

	private int productId;
	private String productName;
	private float price;
	private Date manufacturingDate;
	private Date expriryDate;

	public Product(int productId, String productName, float price, Date manufacturingDate, Date expriryDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.expriryDate = expriryDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getExpriryDate() {
		return expriryDate;
	}

	public void setExpriryDate(Date expriryDate) {
		this.expriryDate = expriryDate;
	}
	
	
	@Override
	public int compareTo(Product p) {
		//sort based on Product Name in Ascending Order
		//return this.getProductName().compareTo(p.getProductName());
		
		//sort based on Product Name in Descending Order
		return p.getProductName().compareTo(this.getProductName());
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", manufacturingDate=" + manufacturingDate + "]";
	}

}
