package com.sunbeam.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting_Tester 
{
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		Student []arr=new Student[5];
		arr[0]=new Student(9,"Rohit","Satara",89.23);
		arr[1]=new Student(4,"Rohan","Mumbai",80.38);
		arr[2]=new Student(6,"Vedant","Pune",79.56);
		arr[3]=new Student(3,"Harry","Sangli",68.93);
		arr[4]=new Student(10,"Abhi","Karad",76.45);
		
		do 
		{
			System.out.println("Menu -");
			System.out.println("1.Display The Student Details -");
			System.out.println("2.Sorting on Their City -");
			System.out.println("3.Sorting on their Marks -");
			System.out.println("4.Sorting on their Name-");
			System.out.println("Enter The Choice -");
			choice =sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Before Sorting -");
				for(Student element:arr)
				{
					System.out.println("Student_Details  -"+element);
				}
				break;
			case 2:
				class City_comparator implements Comparator<Student>
				{
				@Override
				public int compare(Student o1, Student o2) 
				{
					int value=o1.city.compareTo(o2.city);
					return value;
				}
				}		
				Comparator<Student> c1=new City_comparator();
				Arrays.sort(arr,c1);
				
				System.out.println("After Sorting -");
				for(Student element:arr)
				{
					System.out.println("Student_Details After Sorting -"+element);
				}
				break;
			case 3:
				class Marks_comparator implements Comparator<Student>
				{

					@Override
					public int compare(Student o1, Student o2) 
					{
						int value =Double.compare(o2.marks, o1.marks);
						
						return value;
					}
				}
				Comparator<Student> m1=new Marks_comparator();
				Arrays.sort(arr,m1);
				
				System.out.println("After Sorting -");
				for(Student element:arr)
				{
					System.out.println("Student_Details After Sorting -"+element);
				}
				break;		
			case 4:
				class Name_comparator implements Comparator<Student>
				{

					@Override
					public int compare(Student o1, Student o2) 
					{
						int value =o1.Name.compareTo(o2.Name);
						
						return value;
					}
				}
				Comparator<Student> n1=new Name_comparator();
				Arrays.sort(arr,n1);
				
				System.out.println("After Sorting -");
				for(Student element:arr)
				{
					System.out.println("Student_Details After Sorting -"+element);
				}
				break;
				
				
		}
		}while(choice!=0);
	}
}
