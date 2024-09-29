package com.extend;

public class Item {
	private int price;
	private String name;
	
	Item(int price, String name){
		this.price=price;
		this.name=name;
	}
	public int getPrice(){
		return this.price;
	}
	public String getName() {
		return this.name;
	}
}
