package com.extend;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Book book= new Book("JAVA", 10000, "han", "12345");
		
		book.print();
		
		System.out.println(book.getPrice());
	}
	public main() {
	
	}
}
