package com.sunbeam.entities;

import java.nio.channels.AcceptPendingException;
import java.util.Objects;
import java.util.Scanner;

enum Category
{
	STORY,
	HISTORICAL,
	ENTERTAINMENT,
	HORROR,
}
public class Book
{
	String isbn;
	Category c;
	double price;
	String Author_Name;
	int Quantity;
	Scanner sc = new Scanner(System.in);
	
	public Book() 
	{
		
	}


	public Book(String isbn, Category c, double price, String author_Name, int quantity)
	{
		this.isbn = isbn;
		this.c = c;
		this.price = price;
		this.Author_Name = author_Name;
		this.Quantity = quantity;
	}
	
	
	 public void Accept() 
	 {
		System.out.println("Enter The Isbn Code -");
		isbn=sc.nextLine();
		System.out.println("Enter The Category /n STORY /n HISTORICAL /n ENTERTAINMENT /n HORROR");
		String choice1;
		choice1=sc.nextLine();
		c=Category.valueOf(choice1);
		System.out.println("Enter The Price - ");
		price=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter The Author Name - ");
		Author_Name=sc.nextLine();
		System.out.println("Enter The Quantity -");
		Quantity = sc.nextInt();
	 }
	
	@Override
	public int hashCode() {
		return Objects.hash(Author_Name, Quantity, c, isbn, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(Author_Name, other.Author_Name) && Quantity == other.Quantity && c == other.c
				&& Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}


	public String getIsbn() {
		return isbn;
	}


	public String setIsbn(String isbn) 
	{
		return this.isbn = isbn;
	}


	@Override
	public String toString() 
	{
		
		return "BOOK_Details - [isbn - "+isbn+ "Category - "+c+ "Price - "+price+ "Author - "+Author_Name+ "Quantity - "+Quantity+"]";
	}


	
	
	
	
	

}
