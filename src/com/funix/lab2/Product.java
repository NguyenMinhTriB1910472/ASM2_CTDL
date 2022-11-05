package com.funix.lab2;

public class Product {
	private String id;
	private String title;
	private int quanlity;
	private double price;
	public Product() {}
	public Product(String id, String title, int quantity, double price) {
		this.id=id;
		this.title=title;
		this.quanlity=quantity;
		this.price=price;
	}
	 @Override
	 public String toString() {
		return id+" |  "+title+"   | "+quanlity+" | "+price;

	 }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuanlity() {
		return quanlity;
	}
	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
}
