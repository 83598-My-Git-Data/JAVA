package com.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 
{
	public static void main(String[] args)
	{

	System.out.println("how many no.of points to plot from user");
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	Point2D[] arr=new Point2D[n];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=new Point2D();
		arr[i].accept();
	}
	int choice;
	
	do 
	{
		
		System.out.println("0.exit");
		System.out.println("1.display details of a specific point");
		System.out.println("2.Display x,y co-ordinates of all points");
		System.out.println("3.2indices for the points");
		
		System.out.println("enter the choice");
		choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 0:
			System.out.println("thank you");
			break;
		case 1:
		{
			System.out.println("enter the index you want to display");
			int index;
			index=sc.nextInt();
			
			if(index<n)
			{
				arr[index].getdetails();
			}
			else
			{
				System.out.println("invalid index");
			}
			break;
		}
			
		case 2:
			
			for(int i=0;i<n;i++)
			{
				System.out.println("display a coordinate x and y");
				arr[i].getdetails();
				
			}
			break;
			
		case 3:
			
			System.out.println("Enter the two indices");
			int index = sc.nextInt();
			int index1 = sc.nextInt();
			
			
			if(index <0 || index > n) {
				System.out.println("Invalid index");
				
			}
			if(index1 <0 || index1 > n) {
				System.out.println("Invalid index");
				
			}
			
			
			if(arr[index].isEqual(arr[index1])){
				System.out.println("Points are equal, cannot compute distance");
				
				
			}
			else {
				double ans = arr[index].calculatedistance(arr[index1]);
				System.out.println("Distance between two points: "+ans);
			}
			break;
		
			

			
			
			
		  }
	   }while(choice!=0);
	}
}
		
	
	
	
	
