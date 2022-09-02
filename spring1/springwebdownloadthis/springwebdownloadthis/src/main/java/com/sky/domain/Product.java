package com.sky.domain;

public class Product {
	
	
	private String productID;
	private String productname;
	private int price;
	
	public Product() {
	
	}

	public Product(String productID, String productname, int price) {
		super();
		this.productID = productID;
		this.productname = productname;
		this.price = price;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productname=" + productname + ", price=" + price + "]";
	}
	
	
}
