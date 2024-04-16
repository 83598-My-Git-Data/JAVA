package com.sunbeam.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		Set<Book> b = new HashSet<>();
		
		do
		{
			System.out.println(".....Menu ...");
			System.out.println("1.Accept book details and add in collection");
			System.out.println("2.Display all books from collection");
			System.out.println("3.Sort the book details as per category and display it.");
			System.out.println("4.Sort the book details as per author and display it.");
			System.out.println("5.Find book by id.");
			System.out.println("Enter The Choice - ");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				Book b1 = new Book();
				b1.Accept();
				b.add(b1);
				break;
			case 2:
				for(Book book:b)
				{
					System.out.println("Book Details - "+book);
				}
				break;
			case 3:
				List<Book> l1=new ArrayList<Book>(b);
				class Category_Comparator implements Comparator<Book>
				{

					@Override
					public int compare(Book o1, Book o2)
					{
						int value =o1.c.compareTo(o2.c);
						return value;
					}
					
				}
				Comparator<Book> boo =new Category_Comparator();
				
				Collections.sort(l1,boo);
				
				
				
				for(Book b2:l1)
				{
					System.out.println("After Sorting -"+b2);
				}
				
		        break;
			case 4:
				List<Book> l2=new ArrayList<Book>(b);
				class Author_Comparator implements Comparator<Book>
				{

					@Override
					public int compare(Book o1, Book o2) 
					{
						int value = o1.Author_Name.compareTo(o2.Author_Name);
						return value;
					}
					
				}
				Comparator<Book> bo=new Author_Comparator();
				Collections.sort(l2,bo);
				
				for(Book b3:l2)
				{
					System.out.println("After Author name Sorting - "+b3);
				}
				break;
			case 5:
				List<Book> l3=new ArrayList<Book>(b);
				Book b4=new Book();
				String id1;
				System.out.println("Enter The isbn Id -");
				id1=sc.next();
				b4.isbn=id1;
				if(b.contains(b4))
				{
					System.out.println("Book Details Exists ....");
				}
				else
				{
					System.out.println("Book Does not found ....");
				}
				break;
			}		
		}while(choice!=0);	
	}
}