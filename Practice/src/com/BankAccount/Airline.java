package com.BankAccount;

import java.util.Scanner;

public class Airline 
{
	
	
	

	public static void main(String[] args) 
	{
//		A small airline has just purchased a computer for its new automated reservations system.
//		You’ve been asked to develop the new system. You’re to write an application to assign seats on
//		each flight of the airline’s only plane (capacity: 10 seats).
//		Your application should display the following alternatives:
//		Please type 1 for First Class and Please type 2 for Economy.
//		If the user types 1, your application should assign a seat in the firstclass section (seats 1–5). If the
//		user types 2, your application should assign a seat in the economy section (seats 6–10). Your
//		application should then display a boarding pass indicating the person’s seat number and whether it’s
//		in the first-class or economy section of the plane.
//		Use a one-dimensional array of primitive type boolean to represent the seating chart of the plane.
//		Initialize all the elements of the array to false to indicate that all the seats are empty. As each seat is
//		assigned, set the corresponding element of the array to true to indicate that the seat is no longer
//		available.
//		Your application should never assign a seat that has already been assigned. When the economy
//		section is full, your application should ask the person if it’s acceptable to be placed in the first-class
//		section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
//		"Next flight leaves in 3 hours."
		String Seat_type;
		int capacity;
		int choice;
		int arr[]=new int[5];
		int arr1[]=new int[5];
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("..........Welcome to MI airlines......-");
			System.out.println("1.First Class");
			System.out.println("2.Second Class");
			System.out.println("Enter The Choice -");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Exit");
				break;
			case 1:
				for(int i=0;i<arr.length;i++)
				{
					if(choice==1)
					{
					System.out.println("Seats in the First Class Section");
					}
				}
				break;
			case 2:
				for(int i=0;i<arr.length;i++)
				{
					if(choice==2)
					{
						System.out.println("Seats in the Economy Class Section");
					}
				}
				break;
			}
			
			
		}while(choice!=0);
		

	}

}
