package com.abc.api;

public class MyCart {

	private int userId;
	private int computerId;
	private String computerName;
	private int quantity;
	private float totalPrice;
	
	
	public int getUserId() {
		return userId;
	}
	public int getComputerId() {
		return computerId;
	}
	public String getComputerName() {
		return computerName;
	}
	public int getQuantity() {
		return quantity;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}
