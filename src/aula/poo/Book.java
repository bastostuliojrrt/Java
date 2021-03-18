package aula.poo;

import aula.poo.Author;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName(){
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQtyInStock() {
		return qtyInStock;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return "Título do Livro: " + name + ", " + author + ", Preço: R$ " + price + ", Quant. em estoque: " + qtyInStock + " UN";
	}
	
}
