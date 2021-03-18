package aula.poo;

import java.util.*;
import aula.poo.Book;
import aula.poo.Author;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do autor1: ");
		String name = input.next();
		
		System.out.println("Digite seu e-mail: ");
		String email = input.next();
		
		System.out.println("Digite o gênero do autor: ");
		char gender = input.next().charAt(0);
		
		Author autor1 = new Author(name, email, gender);
		
		
		System.out.println("Digite o nome do autor2: ");
		name = input.next();
		
		System.out.println("Digite o seu e-mail: ");
		email = input.next();
		
		System.out.println("Digite o gênero do autor: ");
		gender = input.next().charAt(0);
		
		Author autor2 = new Author(name, email, gender);
		
		System.out.println(autor1);
		System.out.println(autor2);
		
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		System.out.println("Digite o nome do livro1: ");
		input.nextLine();
		String nome = input.nextLine();
		
		Author author = autor1;
		
		System.out.println("Digite o preço do livro1: ");
		double price = input.nextDouble();
		
		System.out.println("Digite a quantidade em estoque: ");
		int qtyInStock = input.nextInt();
		
		Book livro1 = new Book(nome, author, price, qtyInStock);
		
				
		System.out.println("Digite o nome do livro2: ");
		input.nextLine();
		nome = input.nextLine();
		
		author = autor2;
		
		System.out.println("Digite o preço do livro2: ");
		price = input.nextDouble();
		
		System.out.println("Digite a quantidade em estoque: ");
		qtyInStock = input.nextInt();
		
		Book livro2 = new Book(nome, author, price, qtyInStock);
		
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		System.out.println(livro1);
		System.out.println(livro2);

		
	}

}
