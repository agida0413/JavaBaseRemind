package com.extend;

public class Book  extends Item{

	private String author;
	private String isbn;
	
	Book(String name, int price, String author,String isbn){
	 super(price,name);
	 this.author=author;
	 this.isbn=isbn;
	}
	
	public void print() {
		System.out.println(super.getName());
		System.out.println(super.getPrice());
		System.out.println(this.author);
		System.out.println(this.isbn);
	}
}
